package java_pta.report10;

import java.io.*;

    public class Test1 {
    public static void main(String[] args) throws IOException {
        int sum = 0;

        try (
                DataInputStream input =
                        new DataInputStream(new FileInputStream("/home/shizhanli/java6.txt"));
        ) {
            while (true)
                sum += input.readInt();
        }
        catch (EOFException ex) {
            System.out.println("Sum of the integers is: " + sum);
        }

}
    }