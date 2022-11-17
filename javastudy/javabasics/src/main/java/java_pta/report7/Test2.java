package java_pta.report7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        System.out.print("Enter two numbers: ");
        do {
            try {
                int number1 = input.nextInt();
                int number2 = input.nextInt();
                System.out.println(
                        "The sum is " + (number1 + number2));
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Try again. (" +
                        "Incorrect input: two integers are required) ");
                input.nextLine(); // Discard input
            }
        } while (continueInput);
    }
}