package Assignments.AdvancedJava.Day2.Assignment14;

public class CurrentAccount extends Account{
    private double currentAmount;

    public CurrentAccount(){
        System.out.println("Current account constructor");
    }

    public CurrentAccount(int accountNo, Customer customer, double balance, double currentAmount){
        super(accountNo,customer,balance);
        this.currentAmount = currentAmount;
        System.out.println("Current account parameterized constructor");
    }

    public void withdraw(double amount){
        if(this.currentAmount - amount < -1000){
            System.out.println("The withdraw amount is below allowed balance");
        }
        else {
            this.currentAmount -=amount;
        }
    }

    public double getEligibilityAmount(){
        return balance+10000;
    }
}
