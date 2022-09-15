package javaclass_test.three;

import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s = ""; //存目标字符串
        String str1; //输入的字符串
        String str2 = "";
        String str3 = "";
        while(true) {
            str1 = input.nextLine();
            if (str1.contentEquals("end")) {
                break;
            }else {
                s = s.concat(str1) + '\n';
            }
        }
        str2 = input.next();
        str3 = input.next();
        s = s.replace(str2,str3);//替换
        System.out.print(s);
    }
}
