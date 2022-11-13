package java_pta.report5;

import jdk.swing.interop.SwingInterOpUtils;

import java.math.BigInteger;

public class Test3 {
    public static void main(String[] args) {
        int c=0;
        BigInteger n=new BigInteger(String.valueOf(Long.MAX_VALUE));
        BigInteger bi1=new BigInteger("5");
        BigInteger bi2=new BigInteger("6");
        BigInteger bi0=new BigInteger("0");

        System.out.println("\nFirst ten numbers greater than Long.MAX_VALUE" +" that are divisible by 5 or 6:");
        while(c<10){
            n=n.add(new BigInteger("1"));
            if((n.remainder(bi1)).compareTo(bi0)==0 || (n.remainder(bi2)).compareTo(bi0)==0){
                c++;
                System.out.println(n);
            }
        }
    }
}
