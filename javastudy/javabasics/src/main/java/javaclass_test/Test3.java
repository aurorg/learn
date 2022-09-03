package javaclass_test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Person person = new Person();

        for(int i=0;i<3;i++ ){

            String name= scanner.next();
            String gender=scanner.next();
            int age=scanner.nextInt();

            person=new Person(name,gender,age);

        }
        System.out.println(person.getAvgAge());
    }
}

class Person{

    private String name;
    private String gender;
    private int age;
    private static int avgAge=0;

    public Person(){

    }
    public Person(String name,String gender,int age){

        this.name=name;
        this.age=age;
        this.gender=gender;

        avgAge+=age; //
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static void setAvgAge(int avgAge) {
        Person.avgAge = avgAge;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvgAge() {
        return avgAge/3;
    }
}
