package Assignments.AdvancedJava2.Assignment6;

public class WithdrawTransaction extends Security implements Runnable{
    private int transactionID;
    private Account account;
    private Customer customer;
    private double amount;

    public WithdrawTransaction(int transactionID, Account account, Customer customer, double amount) {
        this.transactionID = transactionID;
        this.account = account;
        this.customer = customer;
        this.amount = amount;
    }

    public double withdraw(Account account, double amount) throws InsufficientBalanceException{
        if(account.getBalance()>=amount){
            account.setBalance(account.getBalance()-amount);
        }
        else{
            throw new InsufficientBalanceException();
        }
        return account.getBalance();
    }

    @Override
    public void run(){
        try{
            authorization(account,customer);
            double balance = withdraw(account,amount);
            System.out.println(transactionID+" transaction completed!!! and the balance amount is "+balance);
        }
        catch (UnauthorizedWithdrawTransactionException exception){
            System.out.println(transactionID+" transaction failed!!!  and "+exception.getMessage());
        }
        catch (InsufficientBalanceException exception){
            System.out.println(transactionID+" transaction failed!!! and your account has insufficient balance");
        }
    }
}
