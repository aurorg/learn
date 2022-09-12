package javaclass_test.report1.a1;

import java.util.Scanner;
/* 你的代码将被嵌入到这里 */

class Rectangle{

    double width;
    double height;

    Rectangle()
    {
        width=1;
        height=1;
    }

    Rectangle(double w , double h){
        width=w;
        height=h;
    }




    double getArea()
    {
        return width*height;
    }

    double getPerimeter()
    {
        return  2*(width+height);
    }

}

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

