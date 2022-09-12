package javaclass_test.report1.a1;

import java.util.Scanner;

public class Test6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta;
        delta = b * b - 4 * a * c;
        double x1, x2;

        if (a == 0 && b == 0 & c == 0) {
            System.out.println("Zero Equation");
        } else if (a == 0 && b == 0 && c != 0) {
            System.out.println("Not An Equation");
        } else if (a == 0 && b != 0) {
            x1 = -c / b;
            if (x1 == 0) {
                x1 = 0;
            }
            System.out.printf("%.2f", x1);
        } else if (delta == 0) {
            x1 = -b / 2.0 / a;

            System.out.printf("%.2f", x1);
        } else if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / 2.0 / a;
            x2 = (-b - Math.sqrt(delta)) / 2.0 / a;
            System.out.printf("%.2f\n",x1);
            System.out.printf("%.2f",x2);
        } else if (delta < 0) {
            double s, x;
            s = -b / 2.0 / a;
            x = Math.sqrt(-delta) / 2.0 / a;
            x=Math.abs(x);
            if(s==0){
                s=0;
            }

            System.out.printf("%.2f+%.2fi\n", s, x);
            System.out.printf("%.2f-%.2fi\n", s, x);

        }

    }
}
