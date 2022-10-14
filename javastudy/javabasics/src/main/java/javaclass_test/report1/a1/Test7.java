package javaclass_test.report1.a1;
class Base {
    private Base() { System.out.println(0);}
    public Base(int i) {System.out.println(i);}
}

public class Test7 extends Base {
    public Test7() {super(1);};
    public static void main(String argv[]){
        Test7 t = new Test7();
    }
}