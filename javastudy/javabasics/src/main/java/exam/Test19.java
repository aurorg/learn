package exam;

//字符串替换

import java.util.ArrayList;
import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
        ArrayList<String> ls=new ArrayList<String>();
        Scanner in=new Scanner(System.in);
        int len=0;
        ls.add(in.nextLine());
        while(ls.get(len).compareTo("end")!=0){
            len++;
            ls.add(in.nextLine());
        }
        String a=in.nextLine();
        String b=in.nextLine();
        String[] ss=new String[len];
        for(int i=0;i<len;i++){
            ss[i]=ls.get(i).replace(a,b);
        }
        for(int i=0;i<len;i++){
            System.out.println(ss[i]);
        }
        in.close();
    }
}
