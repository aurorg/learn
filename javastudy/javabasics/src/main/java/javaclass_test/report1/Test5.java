package javaclass_test.report1;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print(
                "Enter an amount in integer for example 1156 (the last 2 digits represent cents): ");
        int originAmount = input.nextInt();
        int remainingAmount = originAmount;

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickles = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies =remainingAmount;

        System.out.println("Your amount " + originAmount + " consisit of");
        System.out.println("    " + numberOfOneDollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickles + " nickles");
        System.out.println("    " + numberOfPennies + " pennies");
    }
}