package exam;

import java.util.Scanner;

//字符串前缀
public class Test14 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       while(sc.hasNext()){
           String str1=sc.next();
           String str2=sc.next();
           String s="";
           int min=Math.min(str1.length(),str2.length());
           for(int i=0;i<min;i++){
               if(str1.charAt(i)==str2.charAt(i)){
                   s+=str1.charAt(i);
               }else{
                   break;
               }
           }
           if(s==""){
               System.out.println("No");
           }else{
               System.out.println("The" + s);
           }
       }
    }
}
