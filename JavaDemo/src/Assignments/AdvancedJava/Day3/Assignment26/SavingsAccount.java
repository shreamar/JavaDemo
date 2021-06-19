package Assignments.AdvancedJava.Day3.Assignment26;

import Assignments.AdvancedJava.Day2.Assignment17.Customer;

public class SavingsAccount extends Account {
    private double minimumBalance = 500;
    private int interestRate = 12;

    public SavingsAccount(){
        System.out.println("Savings account constructor");
    }

    public SavingsAccount(int accountNo, Customer customer, double balance){
        super(accountNo,customer,balance);
        System.out.println("Savings account parameterized constructor");
    }

    public void withdraw (double amount) throws InsufficientBalanceException{
        if((super.balance - amount) < this.minimumBalance){
            throw new InsufficientBalanceException();
        }
        else{
            super.balance -= amount;
        }
    }

    public void calculateInterest(){
        super.balance += (super.balance*this.interestRate)/100.0;
    }
}
