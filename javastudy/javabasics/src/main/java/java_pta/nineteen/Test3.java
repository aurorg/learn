package java_pta.nineteen;

import java.util.*;
public class Test3 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("Australian","Spain");
        map.put("Spain","Australian");
        map.put("Holland","Chile");
        map.put("Chile","Holland");
        map.put("Cameroon","Brazil");
        map.put("Brazil","Cameroon");
        map.put("Croatia","Mexico");
        map.put("Mexico","Croatia");
        Scanner input=new Scanner(System.in);
        String str=input.next();
        if(map.containsKey(str)){
            System.out.println(str+" team's rival is "+map.get(str)+".");
        }else{
            System.out.println(str+"'s team has no match today.");
        }
    }
}
