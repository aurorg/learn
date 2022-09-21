package java_thread.threadtest;

public class Test06 {
    public static void main(String[] args) {

        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //5S之后才执行这里的代码
        System.out.println("hello");
    }
}
