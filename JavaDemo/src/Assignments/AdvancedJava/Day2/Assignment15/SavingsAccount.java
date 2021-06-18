package Assignments.AdvancedJava.Day2.Assignment15;

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

    public void withdraw(double amount){
        if((super.balance - amount) < this.minimumBalance){
            System.out.println("Cannot withdraw below the minimum balance");
        }
        else{
            super.balance -= amount;
        }
    }

    public void calculateInterest(){
        super.balance += (super.balance*this.interestRate)/100.0;
    }
}
