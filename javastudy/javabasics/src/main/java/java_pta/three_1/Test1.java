package java_pta.three_1;

//6-1 设计一个矩形类Rectangle
//        分数 10
//        作者 张德慧
//        单位 西安邮电大学
//        设计一个名为Rectangle的类表示矩形。这个类包括：
//        两个名为width和height的double型数据域，它们分别表示矩形的宽和高。width和height的默认值都为1.
//        一个无参构造方法。
//        一个为width和height指定值的矩形构造方法。
//        一个名为getArea()的方法返回这个矩形的面积。
//        一个名为getPerimeter()的方法返回这个矩形的周长。


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
