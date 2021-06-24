package Assignments.AdvancedJava3.Assignment2;

import java.security.Principal;

public class CustomerAccountTester {

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

    public void acceptAccountInfo(){
        System.out.println("Please enter your account detials:");
        System.out.print("Account number: ");
        String accountNo = ReadData.acceptString();
        System.out.print("Customer number: ");
        String customerNo = ReadData.acceptString();

        Customer customer = new CustomerFileDB().getCustomer(Integer.parseInt(customerNo));

        if(customer == null){
            System.out.println("\nError! Customer does not exist. Your entry couldn't be saved.");
        }
        else{
            Account account = new Account();
            account.setAccountNo(Integer.parseInt(accountNo));
            account.setCustomer(customer);

            int status = new AccountFileDB().saveAccount(account);

            if(status == 0){
                System.out.println("Your details are saved");

                ReadData.acceptString();
                System.out.println("\n\n\n\n\n\n\n");
            }
            else {
                System.out.println("Unable to save your details. Please try again later.");

                ReadData.acceptString();
                System.out.println("\n\n\n\n\n\n\n");
            }
        }
    }

    public void displayCustomerInfo(){
        System.out.println("\n\nPlease enter customer ID :");
        String custID = ReadData.acceptString();
        Customer customer = new CustomerFileDB().getCustomer(Integer.parseInt(custID));

        if(customer!=null){
            System.out.println("\n Customer ID: "+customer.getCustomerID());
            System.out.println(" Customer name: "+customer.getCustomerName());
            System.out.println();
        }
        else {
            System.out.println("Invalid customer ID !!!");
            ReadData.acceptString();
            System.out.println("\n\n\n\n\n\n\n");
        }
    }

    public void displayAccountInfo(){
        System.out.println("\n\nPlease enter account number: ");
        String accountNo = ReadData.acceptString();
        Account account = new AccountFileDB().getAccount(Integer.parseInt(accountNo));

        if(account != null){
            System.out.println("Accont number :"+account.getAccountNo());
            System.out.println("Customer ID: "+account.getCustomer().getCustomerID()+
                    ", Customer name: "+account.getCustomer().getCustomerName());
            System.out.println("Account balance: $"+account.getBalance()+"\n");
        }
        else{
            System.out.println("Invalid Account number !!!");
            ReadData.acceptString();
            System.out.println("\n\n\n\n\n\n\n");
        }
    }

    public void menuDisplay(){

        while (true){
            System.out.println("\tCustomer/Account Menu");
            System.out.println("------------------------------------------------------------------");
            System.out.println("1. Add Customer");
            System.out.println("2. Get Customer Info");
            System.out.println("3. Add Account");
            System.out.println("4. Get Account Info");
            System.out.println("5. Exit");
            System.out.println("\nEnter option: ");
            String optedValue = ReadData.acceptString();

            int option = Integer.parseInt(optedValue);
            switch (option){
                case 1: acceptCustomerInfo();break;
                case 2: displayCustomerInfo();break;
                case 3: acceptAccountInfo();break;
                case 4: displayAccountInfo();break;
                case 5: System.exit(0);break;
                default: System.out.println("Enter a valid option");
                ReadData.acceptString();
            }
        }
    }
}
