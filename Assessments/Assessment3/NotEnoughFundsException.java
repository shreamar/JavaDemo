package Assessment3;

public class NotEnoughFundsException extends Exception{
    public NotEnoughFundsException(){
        super("Not enough funds available.");
    }
}
