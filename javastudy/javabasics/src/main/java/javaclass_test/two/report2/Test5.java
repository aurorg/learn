package javaclass_test.two.report2;

public class Test5 {
    public static void main(String[] args) {
        Test4_MyPoint mp = new Test4_MyPoint();
        System.out.println(mp.distance(10, 30.5));

        System.out.printf("%.4f", mp.distance(10, 30.5));
    }
}

 class Test4_MyPoint {
    // 坐标
    double x, y;
    // 无参构造方法
    public Test4_MyPoint(){
        x = 0;
        y = 0;
    }
    // 有参构造方法
    public Test4_MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    // distance方法：到MyPoint类
    public double distance(Test4_MyPoint mp){
        return Math.sqrt((mp.x - this.x) * (mp.x - this.x) + (mp.y - this.y) * (mp.y - this.y));
    }
    // distance方法：到两个坐标值
    public double distance(double x, double y){
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }
}

