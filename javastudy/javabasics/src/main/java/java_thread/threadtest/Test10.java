package java_thread.threadtest;

public class Test10 {
    public static void main(String[] args) {

        MyRunnable4 r = new MyRunnable4();
        Thread t = new Thread(r);
        t.setName("t");
        t.start();

        //模拟5秒
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //终止线程
        r.run=false;

    }
}

class MyRunnable4 implements Runnable {

    //标记
    boolean run = true;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (run) {
                System.out.println(Thread.currentThread().getName() + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            else{
                //return就结束了
                return;
            }
        }
    }
}