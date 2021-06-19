package Assignments.AdvancedJava.Day3.Assignment26;

import Assignments.AdvancedJava.Day2.Assignment17.Customer;

public class CurrentAccount extends Account {
    private double currentAmount;
    private double allowedNegativeAmount = 1000;

    public CurrentAccount(){
        System.out.println("Current account constructor");
    }

    public CurrentAccount(int accountNo, Customer customer, double balance, double currentAmount){
        super(accountNo,customer,balance);
        this.currentAmount = currentAmount;
        System.out.println("Current account parameterized constructor");
    }

    public void withdraw(double amount) throws InsufficientBalanceException{
        if(this.currentAmount - amount < -(this.allowedNegativeAmount)){
            throw new InsufficientBalanceException();
        }
        else {
            this.currentAmount -=amount;
        }
    }

    public double getEligibilityAmount(){
        return balance+this.allowedNegativeAmount;
    }
}
