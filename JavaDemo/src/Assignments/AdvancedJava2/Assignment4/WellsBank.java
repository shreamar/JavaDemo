package Assignments.AdvancedJava2.Assignment4;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WellsBank {
    private static final CustomerDB customerDB = new CustomerDB();
    private static final Login login = new Login();

    public static void main(String[] args) {
        Customer customer = new Customer(1001, "Eren",false);
        customerDB.saveCustomer(customer);
        login.addLogin(1001, "Wells123");

        Customer customer1 = new Customer(1002, "Jean", true);
        customerDB.saveCustomer(customer);
        login.addLogin(1002,"Wells123");

        Customer customer2 = new Customer(1003, "Marco",true);
        customerDB.saveCustomer(customer2);
        login.addLogin(1003,"Mys@123");

        Customer customer3 = new Customer(1004, "Connie",false);
        customerDB.saveCustomer(customer3);
        login.addLogin(1004,"Wells123");

        List<Customer> customerList = customerDB.getAllCustomers();
        if(customerList.isEmpty()){
            System.out.println("No customers in the bank");
        }
        else {
            printCustomerList(customerList);
        }

        Set<Integer> loanAvailedCustomers = customerDB.getLoanAvailedCustomers();
        System.out.println("\nCustomers who have availed the loan");
        System.out.println("_____________________________________________________");
        for (int custID:loanAvailedCustomers) {
            System.out.println(custID);
        }
    }

    public static void printCustomerList(List<Customer> customerList){
        Iterator<Customer> customerIterator = customerList.iterator();
        System.out.println("                 Customer Details");
        System.out.println("----------------------------------");
        System.out.println("CustomerID\tCustomerName\tLoan-availed");
        while (customerIterator.hasNext()){
            Customer customer = customerIterator.next();
            System.out.print(customer.getCustomerID()+"\t");
            System.out.print(customer.getCustomerName()+"\t\t");

            String displayString = "NO";
            if(customer.isLoanAvailed()){
                displayString = "YES";
            }
            System.out.println(displayString);
        }
    }
}
