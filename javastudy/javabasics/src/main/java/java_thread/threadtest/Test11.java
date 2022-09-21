package java_thread.threadtest;

public class Test11 {
    public static void main(String[] args) {
        System.out.println("最高优先级" + Thread.MAX_PRIORITY);
        System.out.println("最低优先级" + Thread.MIN_PRIORITY);
        System.out.println("默认优先级" + Thread.NORM_PRIORITY);



        //获取当前线程对象，获取当前线程的优先级
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName()+"线程的默认优先级是：" +currentThread.getPriority());

        Thread t= new Thread(new MyRunnable5());
        t.setName("t");
        t.start();

    }
}

class MyRunnable5 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程的默认优先级是：" +Thread.currentThread().getPriority());

    }
}
