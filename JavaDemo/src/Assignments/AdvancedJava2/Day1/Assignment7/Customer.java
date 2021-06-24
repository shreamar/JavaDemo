package Assignments.AdvancedJava2.Day1.Assignment7;

public class Customer {
    private int customerID;
    private String customerName;
    private boolean loanAvailed;

    public Customer(int customerID, String customerName, boolean loanAvailed){
        this.customerID = customerID;
        this.customerName = customerName;
        this.loanAvailed = loanAvailed;
    }

    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public boolean isLoanAvailed() {
        return loanAvailed;
    }

    public void setLoanAvailed(boolean loanAvailed) {
        this.loanAvailed = loanAvailed;
    }
}
