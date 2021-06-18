package Assignments.AdvancedJava.Day2.Assignment15;

public class WellsBank {

    /**
     * Calls the deposit method of the respective account type
     * @param account
     * @param amount
     */
    public static void transaction(Account account, double amount){
        account.deposit(amount);
    }

    public static void main(String[] args) {
        Customer levi = new Customer(1001, "Levi Ackermann","Scout Regiment HQ, Trost district",1234);

        SavingsAccount leviSA = new SavingsAccount(101, levi,1000);
        WellsBank.transaction(leviSA,1000);
        System.out.println("Balance: $"+leviSA.balanceEnquiry());
        leviSA.withdraw(1600);
        System.out.println("Balance: $"+leviSA.balanceEnquiry());

        Customer erwin = new Customer(1002, "Erwin Smith","Scout Regiment HQ, Trost district",4321);
        CurrentAccount erwinCA =  new CurrentAccount(102,erwin,500,2000);
        WellsBank.transaction(erwinCA,1500);
        System.out.println("Available balance: $"+erwinCA.getEligibilityAmount());
        erwinCA.withdraw(1000);
        System.out.println("Available balance: $"+erwinCA.getEligibilityAmount());
        erwinCA.withdraw(4000);
        System.out.println("Available balance: $"+erwinCA.getEligibilityAmount());
        erwinCA.withdraw(3000);
        System.out.println("Available balance: $"+erwinCA.getEligibilityAmount());
    }
}
