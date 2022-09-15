package javaclass_test.two.report2;

import java.util.Date;

public class Test1 {
    public static void main(String[] args){
        Account account = new Account(1122,20000);
        if(account.withDraw(2500))
            System.out.println("Success");
        else
            System.out.println("Fail");

        if(account.deposit(2500))
            System.out.println("Success");
        else
            System.out.println("Fail");

        System.out.println("balance:" + account.getBalance());
        System.out.println("monthly interest:" + account.getMonthlyInterestRate() * account.getBalance());
        System.out.println(account.getDate().toString());
    }
}
class Account{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(){
        dateCreated = new Date();
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }

    public Account(int ID, double BALANCE){
        dateCreated = new Date();
        id = ID;
        balance = BALANCE;
        annualInterestRate = 0.045;
    }

    public int getId(){
        return id;
    }

    public void setId(int ID){
        id = ID;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double ba){
        balance = ba;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annual){
        annualInterestRate = annual;
    }

    public Date getDate(){
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 12.0;
    }

    public boolean withDraw(double money){
        if(balance >= money){
            balance -= money;
            return true;
        }
        else
            return false;
    }

    public boolean deposit(double money){
        if(money >= 0){
            balance += money;
            return true;
        }
        else
            return false;
    }
}