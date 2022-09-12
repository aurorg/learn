package javaclass_test.two;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        
        int n=input.nextInt();
        int x=input.nextInt();


        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]= input.nextInt();
        }
        boolean t =false;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                System.out.println(i);
                t=true;
                break;
            }
        }
        if(!t){
            System.out.println("Not Found");
        }
    }

}
