package Assignments.AdvancedJava3.Assignment3;

public class SavingAccount extends Account {
    private float rateOfInterest;
    private double minimumBalance;

    public SavingAccount(int accountNo, Customer customer, double balance, float rateOfInterest, double minimumBalance) {
        super(accountNo, customer, balance);
        this.rateOfInterest = rateOfInterest;
        this.minimumBalance = minimumBalance;
    }

    public float getRateOfInterest() {
        return rateOfInterest;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setRateOfInterest(float rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }
}
