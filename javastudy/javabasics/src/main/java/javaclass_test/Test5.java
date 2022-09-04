package javaclass_test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();


        double LengthSide1, LengthSide2, LengthSide3;


        LengthSide1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        LengthSide2 = Math.pow(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2), 0.5);
        LengthSide3 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);


        double s =(LengthSide1+LengthSide2+LengthSide3)/2;

        double area=Math.pow(s*(s-LengthSide1)*(s-LengthSide2)*(s-LengthSide3),0.5);


        System.out.println("The area of the triangle is " + area);
        sc.close();


    }
}
