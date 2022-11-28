package java_pta.test17;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class Test3 {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<String> a = new ArrayList<String>();
        while(n!=0){
            String s = in.nextLine();
            if(!a.contains(s)){
                a.add(s);
            }
            n--;
        }
        a.sort(new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {
                return Integer.parseInt(s1.substring(0, 4))-Integer.parseInt(s2.substring(0, 4));
            }
        });

        System.out.println(a.size());

        for(String i:a){
            System.out.println(i);
        }
    }
}