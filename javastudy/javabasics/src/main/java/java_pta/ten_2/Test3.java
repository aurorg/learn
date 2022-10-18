package java_pta.ten_2;

//NumberFormatException数字格式异常)编写一个程序，提示用户读取两个整数，然后显示他们的和。程序应该在输入不正确时提示用户再次输入数字。
//
//        输入格式:
//        i 9 （第1次输入）
//        l 8 （第2次输入）
//        5 6 （第3次输入）
//
//        输出格式:
//        Incorrect input and re-enter two integers: （第1次输出提示）
//        Incorrect input and re-enter two integers: （第2次输出提示）
//        Sum is 11 （输出结果）
//
//        输入样例:
//        i 9
//        l 8
//        5 6


import java.util.InputMismatchException;
import java.util.Scanner;

public class Test3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int m,n;
        while(true)
        {

            try{

                m=sc.nextInt();
                n=sc.nextInt();
                System.out.println("Sum is "+(m+n));
            }
            catch(InputMismatchException e)
            {
                sc.nextLine();
                System.out.println("Incorrect input and re-enter two integers:");
                continue;
            }
            break;
        }
    }
}
