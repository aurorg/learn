package java_pta.test17;

import java.util.*;
public class Test1{
    public static void main(String []args)
    {
        //查找成绩并折算后输出
        //从键盘输入若干人名、地名或者国家名，要求按照升序排序之后输出。
        /*输入格式：
         *7（表示将输入7个人名或者地名）
         *Zhang3
         *Li4
         *Wang5
         *Ma6
         *Chen7
         *Shu8
         *Ren9
         *输出格式：
         *Chen7
         *Li4
         *Ma6
         *Ren9
         *Shu8
         *Wang5
         *Zhang3
         */
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        List<String> list = new ArrayList<>(size);
        for(int i = 0;i<size;i++)
        {
            list.add(input.next());
        }
        Collections.sort(list, (a, z) -> a.compareTo(z));
        for(int i = 0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}


