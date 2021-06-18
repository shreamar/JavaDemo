package Assignments.AdvancedJava.Day2.Assignment17;

public abstract class Account {
    private int accountNo;
    private Customer customer;
    protected double balance;

    public Account(){
        System.out.println("Account class constructor");
    }
    public Account(int accountNo, Customer customer, double balance){
        System.out.println("Account class parameterized constructor");
        this.accountNo = accountNo;
        this.customer = customer;
        this.balance = balance;
    }

    public Customer getCustomer(){
        return customer;
    }

    public double balanceEnquiry(){
        return balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public abstract void withdraw(double amount);
}

