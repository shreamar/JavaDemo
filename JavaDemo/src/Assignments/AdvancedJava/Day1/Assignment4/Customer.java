package Assignments.AdvancedJava.Day1.Assignment4;

public class Customer {
    private int customerID;
    private String customerName;
    private String address;
    private int pinCode;

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.customerID = 1234;
        customer.customerName = "Levi Ackermann";
        customer.address = "Scout Regiment HQ, Trost district";
        customer.pinCode = 4321;

        System.out.println("Customer ID: "+customer.customerID);
        System.out.println("Customer name: "+customer.customerName);
        System.out.println("Customer address: "+customer.address);
        System.out.println("Customer pin code: "+customer.pinCode);
    }
}
