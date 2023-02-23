package exam;

//直角三角形实现IShape接口

import java.text.DecimalFormat;
import java.util.Scanner;

interface IShape{
    public abstract double getArea();
    public abstract double getPerimeter();
}
public class Test17 {
    public static void main(String[] args) {
        DecimalFormat d=new DecimalFormat("#.####");
        Scanner input = new Scanner(System.in);
        double a=input.nextDouble();
        double b=input.nextDouble();
        IShape r=new RTriangle(a,b);
        System.out.println(d.format(r.getArea()));
        System.out.println(d.format(r.getPerimeter()));
        input.close();
    }
}
//补全代码
class RTriangle implements IShape{
    double a,b;
    public RTriangle(double a,double b){
        super();
        this.a=a;
        this.b=b;
    }
    public double getArea(){
        return 0.5*a*b;
    }
    public double getPerimeter(){
        return a+b+Math.sqrt(a*a+b*b);
    }
}