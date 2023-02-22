package exam;

import java.util.*;

class Student {
    String number;
    String name;
    float score;

    // Constructor
    Student(String number1, String name1, float score1) {
        number = number1;
        name = name1;
        score = score1;
    }

    // Used to print student details in main()
    public String toString() {
        return this.number + " " + this.name + " " + this.score;
    }
}

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();


        /* 请在这里补全代码，使程序完成指定的功能。 */
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            ar.add(new Student(in.next(), in.next(), in.nextFloat()));
        }

        ar.sort(new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return o1.number.compareTo(o2.number);
            }

        });

        ar.forEach(e -> {
            System.out.println(e.toString());

        });
        in.close();


    }
}