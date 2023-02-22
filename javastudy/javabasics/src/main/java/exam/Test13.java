package exam;


import java.math.BigInteger;
import java.util.Scanner;

//找素数
public class Test13 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       BigInteger m=sc.nextBigInteger();
       int n=sc.nextInt();
       int cnt=0;
       while(cnt!=n){
           if(m.isProbablePrime(50)){
               cnt++;
               System.out.println(m);
           }
           m=m.add(BigInteger.ONE);
       }

    }

}
