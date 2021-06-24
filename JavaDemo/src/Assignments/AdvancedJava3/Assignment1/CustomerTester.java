package Assignments.AdvancedJava3.Assignment1;

import java.util.spi.ToolProvider;

public class CustomerTester {

    public void acceptCustomerInfo(){
        System.out.print("\n\n\tPlease enter the details of the customer: ");
        System.out.print("CustomerID :");
        String custID = ReadData.acceptString();
        System.out.print("Customer name :");
        String custName = ReadData.acceptString();

        Customer customer = new Customer();
        customer.setCustomerID(Integer.parseInt(custID));
        customer.setCustomerName(custName);

        int status = new CustomerFileDB().saveCustomer(customer);
        if(status == 0){
            System.out.println("Your details are saved");

            ReadData.acceptString();
            System.out.println("\n\n\n\n\n\n\n");
        }
        else{
            System.out.println("Your details could not be saved. Please try again later");
            ReadData.acceptString();
            System.out.println("\n\n\n\n\n\n\n");
        }
    }

    public void displayCustomerInfo(){
        System.out.println("\n\nPlease enter customer ID :");
        String custID = ReadData.acceptString();
        Customer customer = new CustomerFileDB().getCustomer(Integer.parseInt(custID));

        if(customer!=null){
            System.out.println("\n Customer ID "+customer.getCustomerID());
            System.out.println(" Customer name "+customer.getCustomerName());
            System.out.println();
        }
        else {
            System.out.println("Invalid customer ID !!!");
            ReadData.acceptString();
            System.out.println("\n\n\n\n\n\n\n");
        }
    }

    public void customerMenu(){

        while (true){
            System.out.println("\tCustomer Menu");
            System.out.println("------------------------------------------------------------------");
            System.out.println("1. Add Customer");
            System.out.println("2. Get Customer Info");
            System.out.println("3. Exit");
            System.out.println("\nEnter option: ");
            String optedValue = ReadData.acceptString();

            int option = Integer.parseInt(optedValue);
            switch (option){
                case 1: acceptCustomerInfo();break;
                case 2: displayCustomerInfo();break;
                case 3: System.exit(0);break;
                default: System.out.println("Enter a valid option");
                ReadData.acceptString();
            }
        }
    }
}
