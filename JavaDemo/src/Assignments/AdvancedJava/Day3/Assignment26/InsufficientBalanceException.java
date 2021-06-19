package Assignments.AdvancedJava.Day3.Assignment26;

public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(){
        super("Sufficient Balance not available");
    }
}
