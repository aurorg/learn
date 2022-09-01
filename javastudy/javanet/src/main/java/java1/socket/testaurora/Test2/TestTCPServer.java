package java1.socket.testaurora.Test2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestTCPServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream is =null;
        ByteArrayOutputStream baos = null;

        try{
            serverSocket = new ServerSocket(2022);
            socket = serverSocket.accept();

            is =socket.getInputStream();

            baos = new ByteArrayOutputStream();
            int len =0;
            byte[] buffer =new byte[1024];
            while((len=is.read(buffer))!=-1){
                baos.write(buffer,0,len);
            }
            System.out.println("收到了来自客户端小杨同学"+
                    socket.getInetAddress().getHostName()+
                    "的消息：" +baos.toString());

        }catch(IOException e){
            e.printStackTrace();

        }finally{
            if(serverSocket!=null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(baos!=null){
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
