package Assignments.AdvancedJava2.Day1.Assignment4;

import java.util.*;

public class CustomerDB {
    private List<Customer> customerList = new ArrayList<>();

    public boolean saveCustomer(Customer customer){
        boolean status = false;
        status = customerList.add(customer);
        return status;
    }

    public List<Customer> getAllCustomers(){
        return customerList;
    }

    public Set<Integer> getLoanAvailedCustomers(){
        Set<Integer> loanAvailedCustomers = new TreeSet<>();

        Iterator<Customer> customerIterator = customerList.iterator();
        while (customerIterator.hasNext()){
            Customer customer = customerIterator.next();
            if(customer.isLoanAvailed()){
                loanAvailedCustomers.add(customer.getCustomerID());
            }
        }
        return loanAvailedCustomers;
    }
}
