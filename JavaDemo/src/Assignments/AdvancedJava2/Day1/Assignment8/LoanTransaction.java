package Assignments.AdvancedJava2.Day1.Assignment8;

public class LoanTransaction implements Runnable{
    private BankFund bankFund;
    private int customerID;
    private double loanAmount;

    public LoanTransaction(BankFund bankFund, int customerID, double loanAmount){
        this.bankFund = bankFund;
        this.customerID = customerID;
        this.loanAmount = loanAmount;
    }

    @Override
    public void run(){
        try{
            synchronized (bankFund) {
                bankFund.checkFund(loanAmount);
                Thread.sleep((long) (2000 * Math.random()));
                double fundAvailable = bankFund.debitFund(loanAmount);

                System.out.println("["+customerID + "] : The loan is disbursed. Please collect the cash from the Teller");
                System.out.println("Fund left in the bank: $" + fundAvailable);
            }
        }
        catch (InsufficientFundException exception){
            System.out.println("Sorry!!! [Customer: "+customerID+"] Please try some days later as we are short of funds");
        }
        catch (InterruptedException exception){
            System.out.println(exception.getMessage());
        }
    }
}
