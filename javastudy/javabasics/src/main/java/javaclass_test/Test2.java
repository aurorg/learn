package javaclass_test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String choice = sc.next();
            try {
                if (choice.equals("number"))
                    throw new NumberFormatException();
                else if (choice.equals("illegal")) {
                    throw new IllegalArgumentException();
                } else if (choice.equals("except")) {
                    throw new Exception();
                } else
                    break;
            }
            catch(Exception e){
                if (choice.equals("number"))
                    System.out.println ("number format exception");
                if (choice.equals("illegal"))
                    System.out.println ("illegal argument exception");
                if (choice.equals("except"))
                    System.out.println ("other exception");
                System.out.println (e);
            }

        }//end while
        sc.close();
    }
}
