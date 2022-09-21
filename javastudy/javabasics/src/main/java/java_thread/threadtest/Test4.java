package java_thread.threadtest;

public class Test4 {
    public static void main(String[] args) {

        //创建线程对象，采用匿名内部类的方式
        //通过一个没有名字的类，new出来的对象
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("分支线程——————");
                }
            }
        });

        //启动线程
        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程——————》");
        }
    }
}
