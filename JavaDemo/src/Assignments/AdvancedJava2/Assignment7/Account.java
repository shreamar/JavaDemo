package Assignments.AdvancedJava2.Assignment7;

public class Account {
    private int accountNo;
    private Customer customer;
    protected double balance;

    public Account(int accountNo, Customer customer, double balance){
        this.accountNo = accountNo;
        this.balance = balance;
        this.customer = customer;
    }

    public Account(){

    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
