package Assessment3;

public class NegativeAmountException extends Exception{
    NegativeAmountException(){
        super("Invalid Amount. Amount cannot be negative");
    }
}
