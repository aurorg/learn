package javaclass_test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//        String s = "";
//        for (int i = 0; i < n; i ++ )
//            s += "*";
//        for (int i = 1; i <= n; i ++ ) {
//            System.out.println(s.substring(0, i));
//        }
//    }
//}