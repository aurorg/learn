package javaclass_test.two;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n =input.nextInt();
        String[] a=new String[n];
        for(int i=0;i<n;i++){
            a[i]= input.next();
        }
        
        Arrays.sort(a);

//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i-1;j++){
//                if(a[j].compareTo(a[j+1])>0){
//                    String t=a[j];
//                    a[j]=a[j+1];
//                    a[j+1]=t;
//                }
//            }
//        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }


//        System.out.println(Arrays.toString(a));

    }
}
