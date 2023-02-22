package exam;

//将学生对象按照成绩降序排序、

import nine.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Student{
    String number;
    String name;
    float score;

    Student(String number1,String name1,float score1){
        number=number1;
        name=name1;
        score=score1;
    }

    public String toString(){
        return this.number + " " +this.name + " " +this.score;
    }
}
public class Test10 {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList();

        //需要补全的代码
        Scanner input=new Scanner(System.in);
        for(int i=0;i<5;i++){
            ar.add(new Student(input.next(),input.next(),input.nextFloat()));
        }
        ar.sort(new Comparator<Student>(){
            @Override
                    public int compare(Student o1,Student o2){
                return (int)(o2.score- o1.score);
            }
        });

        ar.forEach(e->{
            System.out.println(e.toString());
        });
    }
}
