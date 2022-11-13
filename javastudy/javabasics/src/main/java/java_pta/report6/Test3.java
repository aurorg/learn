package java_pta.report6;

import java.util.ArrayList;

public class Test3{
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");
        Course course3 = new Course("Computer Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");

        System.out.println();
        System.out.print("Number of students in course2: "
                + course2.getNumberOfStudents());
    }
}
class Course {
    private String courseName;
    private ArrayList<String> students;
    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<String>();
    }
    public void addStudent(String student) {
        students.add(student);
    }
    public String[] getStudents() {
        String[] a = new String[students.size()];
        return students.toArray(a);
    }
    public int getNumberOfStudents() {
        return students.size();
    }
    public String getCourseName() {
        return courseName;
    }
    public void dropStudent(String student) {
        students.remove(student);
    }
}
