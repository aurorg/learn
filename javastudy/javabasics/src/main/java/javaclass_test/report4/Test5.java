package javaclass_test.report4;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 =sc.nextLine();
        int number =0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)>='A' && s1.charAt(i)<='Z'){
                number++;
            }
        }
        System.out.println("大写字母有" + number + "个");
    }
}
