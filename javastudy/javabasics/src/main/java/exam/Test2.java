package exam;
import java.util.Scanner;
import java.text.DecimalFormat;

abstract class shape {// 抽象类

    /* 抽象方法 求面积 */
    public abstract double getArea();

    /* 抽象方法 求周长 */
    public abstract double getPerimeter();
}
/* 你提交的代码将被嵌入到这里 */

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#.####");// 保留4位小数
        double side = input.nextDouble();

        shape rp = new RPentagon(side);

        System.out.println(d.format(rp.getArea()));
        System.out.println(d.format(rp.getPerimeter()));
        input.close();
    }
}

class RPentagon extends shape{
    private double a;

    RPentagon(double r){
        a=r;
    }
    public double getArea(){
        return 0.25*a*a *Math.sqrt((5));
    }
    public double getPerimeter(){
        return 5 *a;
    }
}
