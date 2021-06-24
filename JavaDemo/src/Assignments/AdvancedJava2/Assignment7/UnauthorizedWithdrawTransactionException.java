package Assignments.AdvancedJava2.Assignment7;

public class UnauthorizedWithdrawTransactionException extends Exception {
    public UnauthorizedWithdrawTransactionException(){
        super("The user is unauthorized for the withdrawal");
    }
}
