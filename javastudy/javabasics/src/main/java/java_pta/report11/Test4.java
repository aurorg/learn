package java_pta.report11;

import java.util.*;
import java.io.*;

public class Test4 {
    public static void main(String[] args) throws Exception {
        // Check number of arguments passed
        if (args.length != 1) {
            System.out.println("yisdhgfbsdrhfgbysdhj");
            System.exit(1);
        }

        // Check if file exists
        File textFile = new File(args[0]);
        if (!textFile.exists()) {
            System.out.println("The file " + args[0] + " does not exist.");
            System.exit(2);
        }

        // Create a list of string
        List<String> list = new ArrayList<>();

        try (
                // Create input file
                Scanner input = new Scanner(textFile);
        ) {
            while (input.hasNext()) {
                String[] array = input.nextLine().split(" ");
                for (int i = 0; i < array.length; i++) {
                    if (array[i].length() > 0 &&
                            Character.isLetter(array[i].charAt(0))) {
                        list.add(array[i]);
                    }
                }
            }
        }
        // Sort the list in ascending alphabetical order
        Collections.sort(list);

        // Display the list
        System.out.println(list);
    }
}
