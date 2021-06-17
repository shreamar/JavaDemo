package Assignments.AdvancedJava.Day2.Assignment8c;

public class Loan {
    private int loanNo;
    private int accountNo;
    private int customerNo;
    private float loanAmount;
    private int loanDuration;
    private float interest;
    private static int loanCounter = 0;

    private Loan(){
        loanCounter++;
    }

    private Loan(int accountNo, int customerNo, int loanDuration, float loanAmount, float interest){
        loanCounter++;
        this.accountNo = accountNo;
        this.customerNo = customerNo;
        this. loanDuration = loanDuration;
        this.loanAmount = loanAmount;
        this.interest = interest;
    }

    public static Loan getLoanInstance(int accountNo, int customerNo, int loanDuration, float loanAmount, float interest){
        return new Loan(accountNo,customerNo,loanDuration,loanAmount,interest);
    }

    public int getNumberofObjects(){
        return loanCounter;
    }

    public void calculateInstallments(){

    }

    public int getAccountNo(){
        return accountNo;
    }

    public int getCustomerNo(){
        return customerNo;
    }

    public float getLoanAmount(){
        return loanAmount;
    }

    public float getInterest(){
        return interest;
    }

    public void setAccountNo(int accountNo){
        this.accountNo = accountNo;
    }

    public void setCustomerNo(int customerNo){
        this.customerNo = customerNo;
    }

    public void setLoanDuration(int loanDuration){
        this.loanDuration = loanDuration;
    }

    public void setLoanAmount(float loanAmount){
        this.loanAmount = loanAmount;
    }

    public void setInterest(float interest){
        this.interest = interest;
    }
}
