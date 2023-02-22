package exam;

import java.math.BigInteger;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int n=input.nextInt();
       int count=0;
       BigInteger j=new BigInteger(String.valueOf(Long.MAX_VALUE));
       j=j.add(BigInteger.valueOf(1));
       while(count<3){
           if(j.mod(BigInteger.valueOf(n)).intValue()==0){
               System.out.println(j.toString());
               count++;
           }
           j=j.add(BigInteger.valueOf(1));
       }
       input.close();
    }
}
