package Assignments.AdvancedJava2.Day1.Assignment6;

public class Security {
    public void authorization(Account account, Customer customer)throws UnauthorizedWithdrawTransactionException{
        if(account.getCustomer().getCustomerID()!=customer.getCustomerID()){
            throw new UnauthorizedWithdrawTransactionException();
        }
    }
}
