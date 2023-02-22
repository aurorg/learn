package exam;

import java.util.HashMap;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        HashMap stringHashMap = new HashMap<>();

        stringHashMap.put("encapsulation","封装性");
        stringHashMap.put("inheritance","继承性");
        stringHashMap.put("polymorphism","多态性");
        stringHashMap.put("object","对象");
        stringHashMap.put("constructor","构造方法");
        stringHashMap.put("message","消息");
        stringHashMap.put("multithreading","多线程");

        String key=scanner.next();
        if(stringHashMap.get(key)==null){
            System.out.println("抱歉！没有找到"+key);
        }else{
            System.out.println(key + ":" +stringHashMap.get(key));
        }
    }
}
