package exam;

//标识符转换

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        char[] ch=new char[str.length()];
        for(int x=0;x<str.length();x++){
            ch[x]=str.charAt(x);

            if(ch[x] >= 'A' && ch[x] <='Z'){
                ch[x]+=32;
                System.out.print("_"+ch[x]);
            }else{
                System.out.println(ch[x]);
            }
        }
    }
}
