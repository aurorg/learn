package javaclass_test.report4;

import java.util.Arrays;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串：");
        String str ="";
        str =sc.nextLine();
        str=sort1(str);
        System.out.println(str);
    }
    public static String sort1(String s){
        int l=s.length();
        char[] ch = new char[l];
        for (int i = 0; i < l; i++) {
            ch[i]=s.charAt(i);

        }
        Arrays.sort(ch);

        String str="";
        for (int i = 0; i < l; i++) {
            str+=ch[i];
        }
        return str;
    }
}
