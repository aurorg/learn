package java_thread.threadtemp;

public class Test3 {
    public static void main(String[] args) {

        Thread t = new Thread(new MyRunnable());

        t.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程——————---");
        }

    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程——————》");
        }
    }
}
