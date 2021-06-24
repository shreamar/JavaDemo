package Assignments.AdvancedJava2.Day1.Assignment7;

public class DepositTransaction extends Thread {
    private int transactionID;
    private Account account;
    private double amount;
    private int customerID;

    public DepositTransaction(int transactionID, Account account, int customerID, double amount){
        this.transactionID = transactionID;
        this.account = account;
        this.customerID = customerID;
        this.amount = amount;
    }

    public synchronized void deposit(Account account, double amount){
        account.setBalance(account.getBalance()+amount);
    }

    public void run(){
        deposit(account, amount);
        System.out.println(transactionID+" transaction completed!!! "+customerID+" thank you for depositing to the account: "+account.getAccountNo());
    }
}
