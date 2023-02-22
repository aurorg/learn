package exam;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String phonenumber=in.nextLine();
        String[] num=phonenumber.split("");
        int k=1;

        if(num[0].compareTo("1")!=0  || num.length!=11){
            System.out.println("No");
        }
        else{
            for(int i=1;i<11;i++){
                if(num[i].compareTo("9")>0  || num[i].compareTo("0")<0 ){
                    System.out.println("No");
                    k=0;
                    break;
                }
            }
            if(k==1){
                System.out.println("Yes");
            }
        }
        in.close();
    }
}
