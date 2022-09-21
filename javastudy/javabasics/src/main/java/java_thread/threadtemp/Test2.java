package java_thread.threadtemp;

public class Test2 {
    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        mythread.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程————————");
        }

    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程——————》");
        }
    }
}
