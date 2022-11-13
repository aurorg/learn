package java_pta.report6temp;

import java.util.Date;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter three side of the triangle:");
        double side1=sc.nextDouble();
        double side2=sc.nextDouble();
        double side3=sc.nextDouble();

        System.out.println("Enter a color:");
        String color=sc.next();
        System.out.println("Is the triangle filled (true/false) ?");
        boolean filled=sc.nextBoolean();

        Triangle triangle = new Triangle(side1,side2,side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ")
                + "filled");


    }
}

class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    Triangle(){
        side1=side2=side3=1;
    }
    Triangle(double side1,double side2,double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea(){
        double s=(side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    public double getPerimeter(){
        return side1 +side2+side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}


class GeometricObject{
    private String color="write"; //颜色
    private boolean filled;       //是否填充了
    private java.util.Date dateCreated; //创建时间

    public GeometricObject(){
        dateCreated=new  java.util.Date();
    }

    public GeometricObject(String color,boolean filled){
        dateCreated =new java.util.Date();
        this.color=color;
        this.filled=filled;
    }
    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
