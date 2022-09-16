package javaclass_test.three;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String str1=sc.nextLine();
        String str2=sc.nextLine();

        String [] datestr1= str1.split("-");
        String [] datestr2= str1.split("-");

        int year1=Integer.parseInt(datestr1[0]);
        int month1=Integer.parseInt(datestr1[1]);
        int day1=Integer.parseInt(datestr1[2]);

        int year2=Integer.parseInt(datestr2[0]);
        int month2=Integer.parseInt(datestr2[1]);
        int day2=Integer.parseInt(datestr2[2]);

        LocalDate ld1 =LocalDate.of(year1,month1,day1);
        LocalDate ld2 =LocalDate.of(year2,month2,day2);

        if(ld1.isBefore(ld2)){
            System.out.println("第一个日期比第二个日期更早");
        }
        else{
            System.out.println("第一个日期比第二个日期更晚");
        }

        long daynumber=ld1.until(ld2, ChronoUnit.DAYS);
        long weeknumber=ld1.until(ld2,ChronoUnit.WEEKS);

        System.out.println("两个日期间隔" + Math.abs(daynumber) + "天");
        System.out.println("两个日期间隔" + Math.abs(weeknumber)+ "周");

    }
}
