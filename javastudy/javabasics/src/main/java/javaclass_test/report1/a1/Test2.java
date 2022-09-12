package javaclass_test.report1.a1;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        double dd = RR.fun();
        System.out.printf("%.2f",dd);
    }
}

class RR{
    public static Double fun(){
        Scanner scanner = new Scanner(System.in);
        double arry[] = new double[5];
        for(int j=0;j<5;j++){
            arry[j]=scanner.nextDouble();
        }

        return arry[2];
    }
}
