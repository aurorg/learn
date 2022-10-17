package javaclass_test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int score=0;
        int a=0,b=0;
        for (int i = 0; i < n; i++) {
            try{
                score=sc.nextInt();
                if(score>100 || score<0){
                    throw new SException("invalid!");
                }
                else{
                    if(score>=60){
                        a++;
                    }else{
                        b++;
                    }
                }
            }catch (SException e){
                System.out.println(score +e.toString());
                i=i-1; //重新输入
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}
class SException extends Exception{
    String msg;
    public SException(String msg){
        this.msg=msg;
    }

    @Override
    public String toString() {
        return  this.msg;
    }
}
