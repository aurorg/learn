package java_pta.four;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
    public static Object max(Comparable[] a){
        Arrays.sort(a);
        return a[4];
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Comparable<String>[] a=new Comparable[5];
        Comparable<Integer>[] b=new Comparable[5];
        for (int i = 0; i < 5; i++) {
            a[i]=sc.next();
        }
        for(int i=0;i<5;i++){
            b[i]=sc.nextInt();
        }

        System.out.println(max(a));
        System.out.println(max(b));
    }
}
