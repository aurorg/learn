package java_pta.report5;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        for(int i=100;i<=1000;i+=100){
            BigInteger n=new BigInteger(i+"");
            System.out.println("i = "+i+" : e = "+fac(n));
        }

    }
    public static BigInteger fac1(int n){
        if(n==0){
            return BigInteger.ONE;
        }
        return new BigInteger(n+"").multiply(fac1(n-1));
    }
    public static BigDecimal fac(BigInteger n){
        BigDecimal e=new BigDecimal(0);
        BigDecimal x=new BigDecimal(1);
        int i=0;
        while(i<=n.intValue()){
            BigDecimal a=x.divide(new BigDecimal(fac1(i)), 25, BigDecimal.ROUND_UP);
            e=e.add(a);
            i++;
        }
        return e;
    }
}