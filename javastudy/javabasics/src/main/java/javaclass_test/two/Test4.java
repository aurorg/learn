package javaclass_test.two;

import java.util.Arrays;
import java.util.Scanner;

public class Test4{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n =input.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++){
            a[i]= input.nextInt();
        }

        Arrays.sort(a);
        for(int i=n-1;i>=0;i--){
            if(i==n-1) {
                System.out.print(a[i]);
            }
            if(i<n-1){
                System.out.print(" " +a[i]);
            }
        }



    }
}