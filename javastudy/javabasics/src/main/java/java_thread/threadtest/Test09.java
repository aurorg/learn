package java_thread.threadtest;

public class Test09 {
    public static void main(String[] args) {
        Thread t = new Thread();

        t.setName("t");
        t.start();

        //模拟5秒
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //终止不能用stop，不好已过时

    }

}

class MyRunnable3 implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"--->" + i);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
