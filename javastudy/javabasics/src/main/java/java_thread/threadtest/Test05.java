package java_thread.threadtest;

public class Test05 {
    public static void main(String[] args) {

        //currentThread就是当前线程对象
        //这个代码出现在main方法中，所以当前线程就是主线程
        Thread curerntThread =Thread.currentThread(); //静态方法
        System.out.println(curerntThread.getName());

        //创建线程对象
        MyThread2 t=new MyThread2();

        //设置线程名字【默认名字是Thread-0】
        //t.setName("ttttt");

        //获取线程名字
        String tname =t.getName();
        System.out.println(tname);

        //启动线程
        t.start();

    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Thread currentThread =Thread.currentThread();
            System.out.println(currentThread.getName()+ "分支线程----" + i);
        }
    }
}