package java_pta.report5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        File file =new File(input.next());
        if(!file.exists()){
            return;
        }
        int number=0;
        double sum=0;
        Scanner fileinput= null;
        try {
            fileinput = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(fileinput.hasNext()){
            sum+=fileinput.nextInt();
            number++;
        }
        System.out.println(sum);
        System.out.println(sum/number);
    }
}
