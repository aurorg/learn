package javaclass_test.two.report2;

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//    System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (equation.isSolvable()) {
            System.out.println("x is " +
                    equation.getX() + " and y is " + equation.getY());
        }
        else {
            System.out.println("The equation has no solution");
        }
    }
}

class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;


    LinearEquation(double a1,double b1,double c1,double d1,double e1,double f1){
    a=a1;
    b=b1;
    c=c1;
    d=d1;
    e=e1;
    f=f1;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }



    public boolean isSolvable(){
        boolean t=true;
        if(a*d-b*c==0)
            t=false;
        else
            t=true;
        return t;
    }

    //解x
    public String getX(){
        if(isSolvable()==true){
            return String.valueOf((e*d-b*f)/(a*d-b*c));
        }
        else
            return "无解";
    }
    //解y
    public String getY(){
        if(isSolvable()==true){
            return String.valueOf((a*f-e*c)/(a*d-b*c));
        }
        else
            return "无解";
    }

}


