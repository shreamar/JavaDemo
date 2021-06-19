package Assignments.AdvancedJava.Day4.Assignment29;

public class WellsBank {
    public static void main(String[] args) {
        Customer jean = new Customer();
        jean.setCustomerID(1006);
        jean.setCustomerName("Jean Kirstein");
        jean.setCustomerAddress("Scout Regiment HQ, Trost district");
        jean.setPinCode(1234);

        System.out.println("Customer ID: "+jean.getCustomerID());
        System.out.println("Customer name: "+jean.getCustomerName());
        System.out.println("Address: "+jean.getCustomerAddress());
        System.out.println("Pin code: "+jean.getPinCode());
    }
}
