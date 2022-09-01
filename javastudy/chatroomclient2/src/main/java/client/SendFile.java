package client;

import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import message.FriendChatmsg;
import message.Message;
import message.SendFile1Message;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

import static client.ChatNettyClient.*;

public class SendFile {

    private static final int MAX_LENGTH=1<<31;

    public SendFile(ChannelHandlerContext ctx, File file, Message message){

        System.out.println("111111111111111111111112");
        try(RandomAccessFile randomAccessFile = new RandomAccessFile(file,"r")){
            //breakPointSend=new RandomAccessFile(breakPointSendPath,"rw");
            String sendFilePath =file.getAbsolutePath();
            String serverPath=null;
            fileLength=(int) randomAccessFile.length();

            if(fileLength>MAX_LENGTH){
                System.out.println("文件大于1G，拒绝发送！");
                return;
            }
            int start =0;
//            //遍历断点续传配置文件
//            while(breakPointSend.read()!=-1){
//                if(breakPointSend.length()-breakPointSend.getFilePointer()<=8)break;
//                breakPointSend.seek(breakPointSend.getFilePointer()-1);
//                int tempLength;
//                if(breakPointSend.readUTF().equals(sendFilePath)){
//                    breakPointSend.readInt();
//                    int lineStart= (int) breakPointSend.getFilePointer();
//                    String s=breakPointSend.readUTF();
//                    if((tempLength=breakPointSend.readInt())<fileLength){
//                        //需要断点续传
//                        serverPath=s;
//                        start=tempLength;
//                        breakPointSend.seek(lineStart);
//                        break;
//                    }
//                }else{
//                    breakPointSend.readInt();
//                    breakPointSend.readUTF();
//                    breakPointSend.readInt();
//                }
//            }
//            if(start==0){//不需要断点续传
//                breakPointSend.seek(breakPointSend.length());
//                breakPointSend.writeUTF(sendFilePath);
//                breakPointSend.writeInt(fileLength);
//            }

            if(message instanceof FriendChatmsg){
                ((FriendChatmsg)message).setFileName(file.getName());
                ((FriendChatmsg)message).setFileSize(fileLength);
                ((FriendChatmsg)message).setPath(serverPath);
                ((FriendChatmsg)message).setFile(new byte[]{2});
            }
            //群

            ctx.writeAndFlush(message);

            int once=(fileLength-start)/100;
            if(once<1024){
                once=1024;
            }else if(once>1048000){
                once=1048000;
            }
            byte[] bytes=new byte[once];
            int byteRead;
            randomAccessFile.seek(start);
            ChatNettyClient.wait1();
            serverPath=(String)blockingQueue.take();

            while((byteRead=randomAccessFile.read(bytes))!=-1){
                if(byteRead<once){
                    bytes= Arrays.copyOfRange(bytes,0,byteRead);
                }
                SendFile1Message sendFile1Message=new SendFile1Message(serverPath,bytes,start,fileLength);
//                if(message instanceof GroupChatRequestMessage){
//                    sendFile1Message.setChatType((byte)1);
//                }

                ChannelFuture sendFile= ctx.writeAndFlush(sendFile1Message);
                start+=byteRead;
                sendFile.sync();
            }//log.info("发送完毕");

            ChatNettyClient.wait1();

            System.out.println();

        }catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
