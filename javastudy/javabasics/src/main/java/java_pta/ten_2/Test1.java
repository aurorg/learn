package java_pta.ten_2;

import java.util.Scanner;

//6-1 jmu-Java-06异常-多种类型异常的捕获
//        分数 3
//        作者 郑如滨
//        单位 集美大学
//        如果try块中的代码有可能抛出多种异常，且这些异常之间可能存在继承关系，那么在捕获异常的时候需要注意捕获顺序。
//
public class Test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String choice = sc.next();
            try {
                if (choice.equals("number"))
                    throw new NumberFormatException();
                else if (choice.equals("illegal")) {
                    throw new IllegalArgumentException();
                } else if (choice.equals("except")) {
                    throw new Exception();
                } else
                    break;
            }
            //
            catch(Exception e){

                if (choice.equals("number"))
                    System.out.println ("number format exception");

                if (choice.equals("illegal"))
                    System.out.println ("illegal argument exception");

                if (choice.equals("except"))
                    System.out.println ("other exception");

                System.out.println (e);
            }
            /*这里放置你的答案*/
        }//end while
        sc.close();
    }
}