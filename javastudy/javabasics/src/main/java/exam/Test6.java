package exam;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test6 {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      String string;
      String string2;
      Set<String> set=new TreeSet<String>();
      Set<String> set2=new TreeSet<String>();
      Set<String> set3=new TreeSet<String>();

      while(in.hasNextLine()){
          string=in.nextLine();
          if(string.equals("end")){
              break;
          }
          else{
              set.add(string);
          }
      }

      while(in.hasNextLine()){
          string2=in.nextLine();
          if(string2.equals("end")){
              break;
          }
          else{
              set2.add(string2);
          }
      }

      set3.addAll(set);
      set3.addAll(set2);

        Iterator iterator=set3.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
