package Assignments.AdvancedJava.Day2.Assignment8;

import java.security.PublicKey;

public class Loan {
    private int loanNo;
    private int accountNo;
    private int customerNo;
    private float loanAmount;
    private int loanDuration;
    private float interest;

    public Loan(){

    }

    public Loan(int accountNo, int customerNo, int loanDuration, float loanAmount, float interest){

    }

    public float calculateInstallments(){

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
