package javaclass_test.three.report3;

import java.util.Arrays;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a[][] =new int[3][3];
        int b[][]=new int[3][3];
        System.out.println("请输入list1:");
        for (int i = 0; i < 3; i++) {
            for(int j=0;j<3;j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("请输入list2:");
        for (int i = 0; i < 3; i++) {
            for(int j=0;j<3;j++) {
                b[i][j] = sc.nextInt();
            }
        }
        int a1[] = new int[9];
        int b1[] = new int[9];
        int num1=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a1[num1]=a[i][j];
                num1++;
            }
        }
        int num2=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b1[num2]=b[i][j];
                num2++;
            }
        }

        Arrays.sort(a1);
        Arrays.sort(b1);
        if(Arrays.equals(a1,b1)){
            System.out.println("这两个数组是相同的");
        }
        else{
            System.out.println("这两个数组不相同");
        }

    }
}
