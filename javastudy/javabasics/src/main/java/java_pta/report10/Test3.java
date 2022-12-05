package java_pta.report10;

import java.io.*;

public class Test3 {
    public static void main(String[] args) throws IOException {
        try ( // Create a random access file
              RandomAccessFile inout =
                      new RandomAccessFile("/home/shizhanli/luck.txt", "rw");
        ) {
            // Check if file has been executed
            if (inout.length() == 0) {
                inout.writeInt(1); // Start count
            }
            else {
                int count = inout.readInt(); // Read current count
                inout.seek(0); // Move the file pointer to the beginning
                inout.writeInt(++count); // Increment the count
            }
        }
    }
}