package javaclass_test.two.report2;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        MyInteger n1 = new MyInteger(a);
        System.out.println("n1 is even? " + n1.isEven());
        System.out.println("n1 is prime? " + n1.isPrime());
        System.out.println("15 is prime? " + MyInteger.isPrime(15));

        char[] chars = {'3', '5', '3', '9'};
        System.out.println(MyInteger.parseInt(chars));

        String s = "3539";
        System.out.println(MyInteger.parseInt(s));

        int b = input.nextInt();
        MyInteger n2 = new MyInteger(b);
        System.out.println("n2 is odd? " + n2.isOdd());
        System.out.println("45 is odd? " + MyInteger.isOdd(45));
        System.out.println("n1 is equal to n2? " + n1.equals(n2));
        System.out.println("n1 is equal to 5? " + n1.equals(5));
        input.close();
    }
}

class MyInteger {
    private int value; //一个名为 value 的 int 数据字段，用于存储此对象表示的 int 值。

    public MyInteger(int value){ //为指定的 int 值创建 MyInteger 对象的构造函数。!!!!
        this.value=value;
    }

    public int getValue() { //返回int 值的get 方法。
        return value;
    }

    // 方法isEven()、isOdd() 和isPrime()，如果值分别为偶数、奇数或素数，则返回true。
    public static boolean isEven(int value){
        if(value%2==0)
            return true;
        else
            return false;
    }

    public static boolean isPrime(int value){
        for(int i = 2; i < value - 1; i++) {
            if(value % i == 0)
                return false;
        }
        return true;

    }


    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    //静态方法isEven(int)、isOdd(int) 和isPrime(int)，如果指定的值分别为偶数、奇数或素数，则返回true。
    public boolean isEven() {
        return isEven(value);
    }                                   //调用静态方法判断对象中的值是否为偶数

    public boolean isPrime() {
        return isPrime(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    //静态方法isEven(MyInteger)、isOdd(MyInteger) 和isPrime(MyInteger)，如果指定的值分别为偶数、奇数或素数，则返回true。
    public static boolean isEven(MyInteger n) {
        return isEven(n.getValue());
    }
    public static boolean isOdd(MyInteger m) {
        if(m.getValue() % 2 != 0)
            return true;
        else
            return false;
    }                                   //判断指定值是否为奇数
    public static boolean isPrime(MyInteger m) {
        for(int i = 2; i < m.getValue() - 1; i++) {
            if(m.getValue() % 2 == 0)
                return false;
        }
        return true;
    }


    public boolean equals(int anotherNum) {
        return value == anotherNum;
    }

    public boolean equals(MyInteger o) {
        return value == o.getValue();
    }

    public static int parseInt(char[] numbers) {
        // numbers consists of digit characters.
        // For example, if numbers is {'1', '2', '5'}, the return value
        //  should be 125. Please note that
        // numbers[0] is '1'
        // numbers[1] is '2'
        // numbers[2] is '5'

        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result * 10 + (numbers[i] - '0');
        }

        return result;
    }

    // You may mention this when you covered Ch8
    public static int parseInt(String s) {
        // s consists of digit characters.
        // For example, if s is "125", the return value
        //  should be 125.
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result * 10 + (s.charAt(i) - '0');
        }

        return result;
    }
}
