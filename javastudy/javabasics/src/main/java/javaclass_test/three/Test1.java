package javaclass_test.three;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();

        Random rand = new Random(k);
        for(int i=0;i<n;i++){
            int x= rand.nextInt(m);
            if(i==n-1)
                System.out.println(x);
        }
    }
}
