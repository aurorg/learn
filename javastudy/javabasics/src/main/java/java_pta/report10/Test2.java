package java_pta.report10;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        int[] numbers = {1, 2, 3, 4, 5};
        try (
                ObjectOutputStream output = new ObjectOutputStream(new
                        FileOutputStream("/home/shizhanli/luck.txt"));
        ) {
            output.writeObject(numbers);
            output.writeDouble(5.5);
            output.writeObject(new java.util.Date());
        }
    }
}