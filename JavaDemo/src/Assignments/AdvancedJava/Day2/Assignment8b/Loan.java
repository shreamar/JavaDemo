package Assignments.AdvancedJava.Day2.Assignment8b;

public class Loan {
    private int loanNo;
    private int accountNo;
    private int customerNo;
    private float loanAmount;
    private int loanDuration;
    private float interest;
    private static int loanCounter = 0;

    public Loan(){
        loanCounter++;
    }

    public Loan(int accountNo, int customerNo, int loanDuration, float loanAmount, float interest){
        loanCounter++;
        this.accountNo = accountNo;
        this.customerNo = customerNo;
        this. loanDuration = loanDuration;
        this.loanAmount = loanAmount;
        this.interest = interest;
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

    public static void main(String[] args) {
        Loan loan = new Loan();
        System.out.println("Number of instances: "+loanCounter);
    }
}
