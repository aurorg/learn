package java_pta.nineteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> al=new ArrayList<String>();
        int x=input.nextInt();
        String m=input.nextLine();
        String s[]=new String[x];
        for (int i = 0; i<x;i++ ) {
            s[i] = input.nextLine();
            al.add(s[i]);
        }
        Collections.sort(al);
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
