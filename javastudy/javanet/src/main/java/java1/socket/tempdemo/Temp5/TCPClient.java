package java1.socket.tempdemo.Temp5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) {
        Socket socket =null;
        OutputStream os =null;
        ByteArrayOutputStream baos =null;
        InputStream is =null;
        try{
            //1.创建Socket对象，
            // 它的第一个参数需要的是服务端的IP，第二个参数是服务端的端口
            InetAddress inet =InetAddress.getByName("127.0.0.1");
            socket = new Socket(inet,8888);

            //2.获取一个输出流，用于写要发送的数据
            os =socket.getOutputStream();

            //3.写入数据
            os.write("你好，我是客户端！ ".getBytes());

            /**
             * 4解析回复
             * 首先必须通知服务器，我已经输出完毕了，
             * 不然服务端不知道什么时候输出完毕
             * 服务端的while循环会一直执行，这样的话就会阻塞
             */
            socket.shutdownOutput();

            //5.获取输入流，用来读取服务端回复的数据
            is = socket.getInputStream();
            baos = new ByteArrayOutputStream();
            int len =0;
            byte[] buffer = new byte[1024];
            while((len=is.read(buffer))!=-1){
                baos.write(buffer,0,len);
            }
            System.out.println("收到了来自服务端的消息：" + baos.toString());
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            //释放资源
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(os!=null){
                try {
                    os.close();
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
