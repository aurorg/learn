package javaclass_test.report1;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a,b,c:");

        double a =input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();

        double delta=b*b-4*a*c;

        if(delta>0){
            double x1=(-b+Math.pow(delta,0.5))/(2*a);
            double x2=(-b-Math.pow(delta,0.5))/(2*a);
            System.out.println("The equation has two roots " + x1 + "and" +x2);
        }

        else if (delta==0){
            double x1=-b/(2.0*a);
            System.out.println("The equation has one root " +x1);
        }

        else{
            System.out.println("The equation has no real roots");
        }
    }
}
