package java_pta.ten_2;

//6-2 求圆面积自定义异常类
//        计算圆的面积，其中PI取3.14，圆半径为负数时应抛出异常，输出相应提示。根据提供的主类信息，编写Circle类和CircleException类，以及在相关方法中抛出异常。

import java.util.*;
public class Test2 {

    public static void main(String[] args) {
        double s=0;
        Scanner sc=new Scanner(System.in);
        double r1,r2;
        r1=sc.nextDouble();
        r2=sc.nextDouble();
        Circleq c1=new Circleq(r1);
        Circleq c2=new Circleq(r2);
        try{
            s = c1.area();
            System.out.println(s);
            s = c2.area();
            System.out.println(s);
        }
        catch (CircleException e){
            e.print();
        }
    }
}

//
class Circleq{
    double r;
    public  Circleq(double r){
        this.r=r;
    }

    //返回圆的面积
    double area() throws CircleException {
        if(this.r<0){
            throw new CircleException(this.r);
        }
        return 3.14*r*r;
    }
}

//打印错误信息
class CircleException extends Exception{
    double r;
    public CircleException(double r)
    {
        super();
        this.r=r;
    }
    void print(){
        System.out.println("圆半径为"+this.r+"不合理");
    }

}


/* 请在这里填写答案 编写Circle 和CircleException类*/
