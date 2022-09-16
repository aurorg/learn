package javaclass_test.three.report3;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入学生的数量：");
        int n=sc.nextInt();
        String name;
        double grade;
        System.out.println("请输入学生的姓名和成绩");
        TreeMap<Double,String> treeMap = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++){
            name=sc.next();
            grade=sc.nextDouble();
            treeMap.put(grade,name);
        }
        treeMap.descendingKeySet();
        System.out.println("按照分数递减的顺序打印学生的名字如下：");
        System.out.println(treeMap.values());

    }
}
