package javaclass_test.report4;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        Random r = new Random(1000);
        for(int i=1;i<51;i++){
            System.out.println("第" + i + "个随机数" + r.nextInt(100));
        }
    }
}
