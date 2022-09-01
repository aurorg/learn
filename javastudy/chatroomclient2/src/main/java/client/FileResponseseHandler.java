package client;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import message.FileResponseMessage;

import static client.ChatNettyClient.*;

public class FileResponseseHandler extends SimpleChannelInboundHandler<FileResponseMessage> {
    private static boolean receive;

    @Override
    protected void channelRead0(ChannelHandlerContext  ctx, FileResponseMessage  msg) throws Exception {
        if(!receive){
//            breakPointSend.writeUTF(msg.getServerPath());
//            breakPointSend.writeInt(0);
            receive=true;
            blockingQueue.put(msg.getServerPath());
            synchronized (waitMessage){
                waitMessage.notify();
            }
        }
        int percent=(int)(((msg.getLength()*1.0)/fileLength)*100);
        System.out.print("\r|");
        for(int i=0;i<percent;i++){
            System.out.print("#");
        }
        for(int i=percent;i<100;i++){
            System.out.print("-");
        }
        System.out.printf("|%3d%%",percent);
//        breakPointSend.seek(breakPointSend.getFilePointer()-4);
//        breakPointSend.writeInt(msg.getLength());
        if(percent==100){
            receive=false;
//            breakPointSend.close();
        }








    }
}
