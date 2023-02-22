package exam;

import java.util.Scanner;

//查成绩并折算后输出
public class Test9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] name=new String[10];
        double[] score = new double[10];
        int i=0;
        name[0]=input.next();
        while(name[i].compareTo("noname")!=0){
            score[i]=input.nextDouble();
            i++;
            name[i]=input.next();
        }

        String lookforname =input.next();
        for(int j=0;j<i;j++){
            if(name[j].compareTo(lookforname)==0){
                System.out.println(score[j]*0.21);
                break;
            }else if(j==(i-1)){
                System.out.println("Not found.");
            }
        }
    }
}
