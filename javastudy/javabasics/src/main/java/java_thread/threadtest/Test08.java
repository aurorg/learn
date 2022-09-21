package java_thread.threadtest;

public class Test08 {
    public static void main(String[] args) {

        Thread t = new Thread(new MyRunnable2());

        t.setName("t");
        t.start();

        //希望5秒之后t线程醒来
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //终端t线程的睡眠（这种终端睡眠的方式依靠了java的异常处理机制）
        t.interrupt(); //干扰
    }
}

class MyRunnable2 implements Runnable{
    //重点：run()当中的异常不能throws，只能用try catch
    //因为run()方法在父类中没有抛出任何异常，子类不能比父类抛出更多的异常

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "--->begin");
        try {
            //睡眠
            Thread.sleep(1000*60*60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + "-----end");
    }
}
