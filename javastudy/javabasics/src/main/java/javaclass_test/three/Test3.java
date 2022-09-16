package javaclass_test.three;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String s=sc.nextLine();
        int n=sc.nextInt();

        int arry[]=new int[5];
        for (int i = arry.length-1; i >=0 ; i--) {
            arry[i]=n%10;
            n=n/10;
        }

        for (int i = 0; i < s.length(); i++) {
            System.out.print((char)(s.charAt(i)+arry[i%5]));
        }
    }
}
