package java_thread.threadtest;

//实现线程的第一种方式
public class Test02 {
    public static void main(String[] args) {

        //新建一个分支线程对象
        MyThread mythread = new MyThread();

        //启动线程
        //start方法的作用：启动一个分支线程，在jvm 中开辟一个新的栈空间，这段代码任务完成之后，瞬间就结束了
        // 这段代码的任务只是为了开启一个新的栈空间，只要新的栈空间开出来，start（）方法就结束了。线程就启动成功了
        //启动成功的线程会自动调用run方法，并且run方法在分支栈的栈底部（压栈）
        //run方法在分支栈的栈底部，main方法在主栈的栈底部。run 和main是平级的
        mythread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程————》" + i);
        }


    }
}

  class MyThread extends Thread{
        @Override
        public void run() {
             //编写程序，这段程序运行在分支线程中（分支栈）
            for (int i = 0; i < 1000; i++) {
                System.out.println("分支线程——————");
            }
        }
    }

