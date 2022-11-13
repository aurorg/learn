package java_pta.report5;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1=sc.nextLine();
        System.out.println("Enter thr second string:");
        String s2=sc.nextLine();

        int index=0;
        String prefix ="";
        while(s1.charAt(index)==s2.charAt(index)){
            prefix+=s1.charAt(index);
            index++;
        }
        if(prefix.length()>0){
            System.out.println("The common prefix is" +prefix);
        }else{
            System.out.println(s1 +  " and " + s2 + "have no common prefix");
        }
    }
}
