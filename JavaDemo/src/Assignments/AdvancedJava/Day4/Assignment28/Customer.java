package Assignments.AdvancedJava.Day4.Assignment28;

public class Customer {
    private int customerID;
    private String customerName;
    private String customerAddress;
    private int pinCode;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int custID) {
        customerID = custID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String custName) {
        customerName = custName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String custAddress) {
        customerAddress = custAddress;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pCode) {
        pinCode = pCode;
    }
}
