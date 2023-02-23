package exam;

//从抽象类shape类扩展出一个圆形类Circle

import java.text.DecimalFormat;
import java.util.Scanner;

abstract class shape{
    public abstract double getArea();

    public abstract double getPerimeter();
}
public class Test12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat d= new DecimalFormat("#.####");
        double r=input.nextDouble();
        shape c=new Circle(r);

        System.out.println(d.format(c.getArea()));
        System.out.println(d.format(c.getPerimeter()));
        input.close();
    }
}
//补全代码
class Circle extends shape{
    private double radius;
    Circle(double radius){
        this.radius=radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
}