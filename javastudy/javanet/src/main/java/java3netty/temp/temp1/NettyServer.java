package java3netty.temp.temp1;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.io.IOException;

public class NettyServer {
    public static void main(String[] args) throws IOException ,InterruptedException{

        //创建BossGroup和WorkGroup
        //说明
        //1.创建两个线程组bossGroup和workerGroup
        //2.bossGroup只是处理连接请求，真正的和客户端业务处理，会交给workerGroup完成
        //3.两个都是无限循环
        //4.bossGroup和workerGroup含有的子线程【NioEventLoop】的个数
        //  默认为：实际cpu核数 *2  【可以自己设置线程的数量】


        NioEventLoopGroup bossGroup = new NioEventLoopGroup(1);

        NioEventLoopGroup workerGroup = new NioEventLoopGroup();

        try {

            //创建服务器端启动的对象，配置参数
            ServerBootstrap bootstrap = new ServerBootstrap();

            //使用链式编程来进行设置
            bootstrap.group(bossGroup, workerGroup)  //设置两个线程组
                    .channel(NioServerSocketChannel.class)  //使用NioSocketChannel作为服务器的通道实现
                    .option(ChannelOption.SO_BACKLOG, 128) //设置线程队列得到的连接数
                    .childOption(ChannelOption.SO_KEEPALIVE, true) //设置保持活动的连接状态
                    .childHandler(new ChannelInitializer<NioSocketChannel>() { //创建一个通道测试对象（匿名对象）

                        //给pipeline设置处理器
                        @Override
                        protected void initChannel(NioSocketChannel ch) throws Exception {
                            ch.pipeline().addLast(new NettyServerHandler());
                                         //.addLast()
                        }

                    }); //给workerGroup的EventLoop对应的管道设置处理器

            System.out.println("服务器启动好了......");

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
