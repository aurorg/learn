package server;

import common.ChatHandlerMap;
import common.MessageCodec;
import common.ProtocolFrameDecoder;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.handler.timeout.IdleStateHandler;
import lombok.extern.slf4j.Slf4j;
import message.OffLinemsg;
import server.serverhandler.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


@Slf4j
public class ChatNettyServer {

    public static void jdbcmysql(){
        // MySQL 8.0 以上版本 - JDBC 驱动名及数据库 URL
        final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://localhost:3306/chatroom?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

        //数据库用户和密码
        final String USER = "root";
        final String PASS = "szl0905";

        //数据的连接对象
        Connection conn = null;

        //传输器
        Statement stat = null;

        //sql语句的执行结果
        ResultSet rs = null;

        //记录语句的输入
        PreparedStatement ps =null;
    }

    public static void main(String[] args) throws IOException ,InterruptedException{

        //创建BossGroup和WorkGroup
        //说明
        //1.创建两个线程组bossGroup和workerGroup
        //2.bossGroup只是处理连接请求，真正的和客户端业务处理，会交给workerGroup完成
        //3.两个都是无限循环
        //4.bossGroup和workerGroup含有的子线程【NioEventLoop】的个数
        //  默认为：实际cpu核数 *2  【可以自己设置线程的数量】
        jdbcmysql();

        NioEventLoopGroup bossGroup = new NioEventLoopGroup();

        NioEventLoopGroup workerGroup = new NioEventLoopGroup();

        //LoggingHandler Log=new LoggingHandler(LogLevel.DEBUG);


        try {

            //创建服务器端启动的对象，配置参数
            ServerBootstrap bootstrap = new ServerBootstrap();

            //使用链式编程来进行设置
            bootstrap.group(bossGroup, workerGroup)  //设置两个线程组
                    .channel(NioServerSocketChannel.class)  //使用NioSocketChannel作为服务器的通道实现
                    //.option(ChannelOption.SO_BACKLOG, 128) //设置线程队列得到的连接数
                    //.childOption(ChannelOption.SO_KEEPALIVE, true) //设置保持活动的连接状态
                    .childHandler(new ChannelInitializer<NioSocketChannel>() { //创建一个通道测试对象（匿名对象）

                        //给pipeline设置处理器
                        @Override
                        protected void initChannel(NioSocketChannel ch) throws Exception {
                            ch.pipeline().addLast(new ProtocolFrameDecoder());
                            ch.pipeline().addLast(new MessageCodec());

                            //心跳机制
                            ch.pipeline().addLast(new IdleStateHandler(16, 0, 0));
                            ch.pipeline().addLast(new ChannelDuplexHandler() {
                                @Override
                                public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
                                    IdleStateEvent event = (IdleStateEvent) evt;
                                    if (event.state() == IdleState.READER_IDLE) {
                                        //log.debug("已经16s没有读到数据");
                                    }
                                    super.userEventTriggered(ctx, evt);
                                }
                            });

                            ch.pipeline().addLast(new ChannelInboundHandlerAdapter() {
                                @Override
                                public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {


                                }
                                //退出下线处理
                                @Override
                                public void channelInactive(ChannelHandlerContext ctx) throws Exception {

                                    if (ChatHandlerMap.getUser(ctx.channel()) != 0) {
                                        OffLinemsg msg = new OffLinemsg();
                                        super.channelRead(ctx, msg);
                                    }
                                }
                            });


                            //需要用什么处理器直接加就行了
                            ch.pipeline().addLast(new SEnrollViewHandle()); //注册
                            ch.pipeline().addLast(new SLoginViewHandler());//登录
                            ch.pipeline().addLast(new SLogoutmsgViewHandler());//注销
                            ch.pipeline().addLast(new SOffLineHandler()); //下线处理

                            ch.pipeline().addLast(new SFriendChatHandler()); //好友聊天
                            ch.pipeline().addLast(new SInformationfriendhistoryHandler()); //查看好友历史消息
                            ch.pipeline().addLast(new SInformationfriendunreadHandler());  //查看好友未读消息的
                            ch.pipeline().addLast(new SSendApplyHandler()); //发送好友申请
                            ch.pipeline().addLast(new SPassFriendApplyHandler()); //通过好友申请的
                            ch.pipeline().addLast(new SDeleteFriendHandler());  //删除好友的
                            ch.pipeline().addLast(new SShieldFriendHandler()); //屏蔽好友的
                            ch.pipeline().addLast(new SFriendListHandler()); //查看好友列表的
                            ch.pipeline().addLast(new SFriendGetFileHandler()); //接收文件的


                            ch.pipeline().addLast(new SGroupAuthenticationMessage()); //群成员身份确认的
                            ch.pipeline().addLast(new SGroupSetupHandler());//建群的
                            ch.pipeline().addLast(new SGroupDeleteHandler());//解散群的
                            ch.pipeline().addLast(new SGroupSendApplyHandler());//申请加群的
                            ch.pipeline().addLast(new SGroupJoinHandler()); //处理加群通知的
                            ch.pipeline().addLast(new SGroupQuitHandler()); //退群的
                            ch.pipeline().addLast(new SGroupListMemberHandler()); //群成员列表
                            ch.pipeline().addLast(new SGroupHistorymsgHandler()); //群历史消息
                            ch.pipeline().addLast(new SGroupUnreadmsgHandler()) ; //群未读消息的
                            ch.pipeline().addLast(new SGroupAddAdministratorHandler()); //添加管理员身份
                            ch.pipeline().addLast(new SGroupDeleteAdministratorHandler()); //删除管理员身份
                            ch.pipeline().addLast(new SGroupDeleteMemberHandler()) ; //将用户移出群
                            ch.pipeline().addLast(new SGroupOpenBanSpeakHandler()) ; //群开启禁言模式
                            ch.pipeline().addLast(new SGroupCloseBanSpeakHandler()); //群关闭禁言模式
                            ch.pipeline().addLast(new SGroupChatHandler()); //群聊的
                            ch.pipeline().addLast(new SGroupGetFileHandler()); //接受群文件的
                            ch.pipeline().addLast(new SFindPasswordHandler()); //找回密码的
                            ch.pipeline().addLast(new SUpdatePasswordHandler()); //修改密码的


                            ch.pipeline().addLast(new FriendReceiveFileHandler());
                            ch.pipeline().addLast(new ReceiverFileHandler());
                            ch.pipeline().addLast(new SendFileHandler());

                        }

                    }); //给workerGroup的EventLoop对应的管道设置处理器

            System.out.println("*****************************服务器启动好了************************************");
            System.out.println("*****************************服务器启动好了************************************");

            //绑定一个端口并且同步，生成一个ChannelFuture对象
            //启动服务器（并且绑定端口）
            ChannelFuture cf = bootstrap.bind(6686).sync();

            //对关闭通道进行监听
            cf.channel().closeFuture().sync();

        }finally{
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }
}
