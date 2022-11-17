package java_pta.report7;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        do {
            System.out.print(
                    "Enter annual interest rate, for example, 8.25: ");
            double annualInterestRate = input.nextDouble();
            System.out.print("Enter number of years as an integer: ");
            int numberOfYeras = input.nextInt();
            System.out.print("Enter loan amount, for example, 120000.95: ");
            double loanAmount = input.nextDouble();

            try {
                Loan loan = new Loan(annualInterestRate, numberOfYeras, loanAmount);
                continueInput = false;
                System.out.printf("The loan was created on %s\n" +
                                "The monthly payment is %.2f\nTne total payment is %.2f\n",
                        loan.getLoanDate().toString(), loan.getMonthlyPayment(),
                        loan.getTotalPayment());
            }
            catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        } while (continueInput);
    }
}
class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan() {
        this(2.5, 1, 1000);
    }
    public Loan(double annualInterestRate, int numberOfYears,
                double loanAmount) {
        setAnnualInterestRate(annualInterestRate);
        setNumberOfYears(numberOfYears);
        setLoanAmount(loanAmount);
        loanDate = new java.util.Date();
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate)
            throws IllegalArgumentException {
        if (annualInterestRate <= 0) {
            throw new IllegalArgumentException(
                    "Annual interest rate must be greater than 0");
        }
        this.annualInterestRate = annualInterestRate;
    }
    public int getNumberOfYears() {
        return numberOfYears;
    }
    public void setNumberOfYears(int numberOfYears)
            throws IllegalArgumentException {
        if (numberOfYears <= 0) {
            throw new IllegalArgumentException(
                    "Number of years must be greater than 0");
        }
        this.numberOfYears = numberOfYears;
    }
    public double getLoanAmount() {
        return loanAmount;
    }
    public void setLoanAmount(double loanAmount)
            throws IllegalArgumentException {
        if (loanAmount <= 0) {
            throw new IllegalArgumentException(
                    "Loan amount must be greater than 0");
        }
        this.loanAmount = loanAmount;
    }
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }
    public java.util.Date getLoanDate() {
        return loanDate;
    }
}