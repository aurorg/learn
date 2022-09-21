package javaclass_test.three;

public class Test5 {
    public static void main(String[] args) {
//        String[] tokens ="Welcome to java".split("o");
//        for (int i = 0; i < tokens.length; i++) {
//            System.out.println(tokens[i] + " ");
//        }
//        String str="ABCDEFG";
//        char[] chars=str.toCharArray();
//        System.out.println(new String(chars,1,3));


            String a = new String("A");
            String b = new String("B");
            mb_operate(a,b);
            System.out.println(a + "." + b);
        }
        static void mb_operate(String x,String y){
            x.concat(y);
            y=x;

    }
}
