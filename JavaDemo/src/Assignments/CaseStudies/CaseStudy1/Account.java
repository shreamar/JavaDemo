package Assignments.CaseStudies.CaseStudy1;

public class Account {
    private int accAmount;
    private int accNo;
    private String custName;

    public int getAccNo(){
        return accNo;
    }

    public int getAccAmount(){
        return accAmount;
    }

    public String getCustName(){
        return custName;
    }

    public void setAccAmount(int accAmount){
        this.accAmount = accAmount;
    }

    public void setAccNo(int accNo){
        this.accNo = accNo;
    }

    public void setCustName(String custName){
        this.custName = custName;
    }
}
