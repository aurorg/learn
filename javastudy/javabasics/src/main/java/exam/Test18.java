package exam;

//正六边形实现接口IShape

import java.text.DecimalFormat;
import java.util.Scanner;

interface IShape{
    double getArea();
    double getPerimeter();
}
public class Test18 {
    public static void main(String[] args) {
        DecimalFormat d =new DecimalFormat("#.####");
        Scanner input = new Scanner(System.in);
        double a=input.nextDouble();
        IShape r=new RHexagon(a);

        System.out.println(d.format(r.getArea()));
        System.out.println(d.format(r.getPerimeter()));
        input.close();
    }
}
//补全代码
class RHexagon implements IShape{
    private double r;

    RHexagon(double r){
        this.r=r;
    }
    public double getArea(){
        return (3*Math.sqrt(3))/2 *r*r;
    }
    public double getPerimeter(){
        return (6*r);
    }
}