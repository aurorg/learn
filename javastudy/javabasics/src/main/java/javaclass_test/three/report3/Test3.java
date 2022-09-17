package javaclass_test.three.report3;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] a=new double[10];
        int j;
        System.out.println("请输入十个数：");
        for (int i = 0; i < 10; i++) {
            a[i]=sc.nextDouble();
        }

     //   for(int i=0;i<a.length;i++){
        for(int i=a.length-1;i>-1;i--){
            int max=i; //记录最大的位置
            //for(j=i+1;j<a.length;j++){
            for(j=i-1;j>-1;j--){
                if(a[j]>a[max]){
                    max=j;
                }
            }
            if(i!=max){
                double t=a[i];
                a[i]=a[max];
                a[max]=t;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
