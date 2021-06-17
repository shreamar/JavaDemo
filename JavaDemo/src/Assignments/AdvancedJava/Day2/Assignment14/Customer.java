package Assignments.AdvancedJava.Day2.Assignment14;

public class Customer {
    private int customerID;
    private String customerName;
    private String customerAddress;
    private int pinCode;

    public Customer(){

    }
    public Customer(int customerID,String customerName, String customerAddress, int pinCode){
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.pinCode = pinCode;
    }

    public void setCustomerID(int customerID){
        this.customerID = customerID;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setCustomerAddress(String customerAddress){
        this.customerAddress = customerAddress;
    }
    public void setPinCode(int pinCode){
        this.pinCode = pinCode;
    }

    public int getCustomerID(){
        return customerID;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getCustomerAddress(){
        return customerAddress;
    }
    public int getPinCode(){
        return pinCode;
    }

}
