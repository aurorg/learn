package exam;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double w = input.nextDouble();
        double h = input.nextDouble();
        Rectangle myRectangle = new Rectangle(w, h);
        System.out.println(myRectangle.getArea());
        System.out.println(myRectangle.getPerimeter());

        input.close();
    }
}

class Rectangle{
    private double width;
    private double height;

    Rectangle(){
        width=1;
        height=1;
    }
    Rectangle(double w,double h){
        width=1;
        height=1;
    }

    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }
}
