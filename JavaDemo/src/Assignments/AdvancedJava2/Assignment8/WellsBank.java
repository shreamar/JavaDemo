package Assignments.AdvancedJava2.Assignment8;

public class WellsBank {
    public static void main(String[] args) {
        BankFund wellsBankFund = new BankFund(9000000);
        LoanTransaction[] loanTransactions = new LoanTransaction[100];

        for(int index = 0; index < loanTransactions.length; index++){
            loanTransactions[index] = new LoanTransaction(wellsBankFund, 1000+index,250000);
        }

        for(int index =0; index<loanTransactions.length; index++){
            Thread loanThread = new Thread(loanTransactions[index]);
            loanThread.start();
        }
    }
}
