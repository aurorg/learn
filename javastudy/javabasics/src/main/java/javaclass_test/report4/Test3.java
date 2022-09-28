package javaclass_test.report4;

import java.util.GregorianCalendar;

public class Test3 {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.get(gc.YEAR) + ":" + gc.get(gc.MONTH) + ":" +gc.get(gc.DAY_OF_MONTH));

        gc.setTimeInMillis(1234567898765L);
        System.out.println(gc.get(gc.YEAR) + ":" + gc.get(gc.MONTH) + ":" +gc.get(gc.DAY_OF_MONTH));
    }
}
