package exam;

import java.math.BigInteger;
import java.util.Scanner;

//简单计算器
public class Test15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str1=input.nextLine();

        if(str1.indexOf('/')!=-1){
            String[] ob=str1.split("\\/",0);
            BigInteger a= new BigInteger(ob[0]);
            BigInteger b= new BigInteger(ob[1]);
            BigInteger c=a.divide(b);
            System.out.println(c);
        }

        if(str1.indexOf('*') !=-1){
            String[] ob=str1.split("\\*",0);
            BigInteger a= new BigInteger(ob[0]);
            BigInteger b= new BigInteger(ob[1]);
            BigInteger c=a.multiply(b);
            System.out.println(c);
        }

        if(str1.indexOf('+') !=-1){
            String[] ob=str1.split("\\+",0);
            BigInteger a= new BigInteger(ob[0]);
            BigInteger b= new BigInteger(ob[2]);
            BigInteger c=a.add(b);
            System.out.println(c);
        }

        if(str1.indexOf('-')!=-1){
            String[] ob=str1.split("\\-",0);
            BigInteger a= new BigInteger(ob[0]);
            BigInteger b=new BigInteger(ob[1]);
            BigInteger c=a.subtract(b);
            System.out.println(c);
        }

    }
}
