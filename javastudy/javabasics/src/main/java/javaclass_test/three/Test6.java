package javaclass_test.three;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        //int a[] = new int[n];
        int k = 0;
        while (k<n) {
             int temp=sushu(m,n);
             if(temp!=0){
                 System.out.println(temp);
                 k++;
             }
             m++;
        }
    }
    public static int sushu(int m,int n){
        for (int i = 2; i <=Math.sqrt(m); i++) {
            if(m%i==0)
                return 0;
        }
        return m;
    }

}
