package javaclass_test.three;

import java.math.BigInteger;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        BigInteger bi = new BigInteger(String.valueOf(Long.MAX_VALUE));

        int n=sc.nextInt();
        int t=0;
        while(t<3){
            if(bi.mod(BigInteger.valueOf(n)).intValue()==0){
                System.out.println(bi);
                t++;
            }
            bi=bi.add(BigInteger.ONE);
        }
    }
}
