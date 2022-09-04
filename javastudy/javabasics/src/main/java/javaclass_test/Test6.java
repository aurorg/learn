package javaclass_test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();

        double delta;
        delta = b * b - 4 * a * c;
        double x1, x2;

        if(a==0 && b==0 & c==0){
            System.out.println("Zero Equation");
        }
        if(a==0 && b==0 && c!=0){
            System.out.println("Not An Equation");
        }
        if(delta==0){
            x1=b/2.0/a;
            x2=b/2.0/a;

            System.out.printf("%.2d",x1);
        }
        if(delta>0){
            x1 = (-b + Math.sqrt(delta)) / 2.0 / a;
            x2 = (-b - Math.sqrt(delta)) / 2.0 / a;

            if(x1<x2){
                double t=x1;
                x1=x2;
                x2=t;
            }

            System.out.printf("%.2d",x1);
            System.out.printf("%.2d",x2);
        }
        if(delta<0){
            double s, x;
            s = -b / 2.0 / a;
            x = Math.sqrt(-delta) / 2.0 / a;
            System.out.println(s + "+" +x + "i");
            System.out.println(s + "-" + x +"i");
        }

    }
}
