package javaclass_test.report1;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter circle1's center x-,y-coordinates,and radius: ");
        double x1=input.nextDouble();
        double y1=input.nextDouble();
        double r1=input.nextDouble();
        System.out.println("Enter circle2's center x-,y-coordinates,and radius: ");
        double x2=input.nextDouble();
        double y2=input.nextDouble();
        double r2=input.nextDouble();

        if(Math.pow(x1-x2,2) + Math.pow(y1-y2,2) <=Math.abs(r1-r2)) {
            //分两种情况
            if (r1 <= r2) {
                System.out.println("Circle1 is inside Circle2");
            } else {
                System.out.println("Circle2 is inside Circle1");

            }
        }
        else if(Math.pow(x1-x2,2) + Math.pow(y1-y2,2) >r1+r2){
            System.out.println("Circle1 does not overlap circle2");
        }
        else{
            System.out.println("Circle overlaps circle2");
        }

    }
}
