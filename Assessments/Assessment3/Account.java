package Assessment3;

public class Account {
    private static int totalAccounts;
    private int accountNumber;
    private double balance;

    public Account() {
        totalAccounts++;
    }

    public Account(int accountNumber, double balance) {
        this();
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public static void main(String[] args) throws Exception {
        Account account = new Account(111, 100);
        Account account1 = new Account(222, 200);
        Account account2 = new Account(333, 100);

        account.deposit(200);
        account1.withdraw(300);
        account2.deposit(-100);

        System.out.println("Total number of accounts: " + Account.totalAccounts);
    }

    public void deposit(int amount) throws NegativeAmountException{
        try {
            if (amount < 0) {
                throw new NegativeAmountException();
            } else {
                this.balance += amount;
                System.out.println("$" + amount + " deposited to account[" + accountNumber + "]");
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            showCurrentBalance();
        }
    }

    public void withdraw(int amount) throws NotEnoughFundsException,NegativeAmountException{
        try {
            if (amount < 0) {
                throw new NegativeAmountException();
            } else if (this.balance - amount < 0) {
                throw new NotEnoughFundsException();
            } else {
                this.balance -= amount;
                System.out.println("$" + amount + " withdrawn from the account[" + accountNumber + "]");
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            showCurrentBalance();
        }
    }

    public void showCurrentBalance(){
        System.out.println("Available balance: $" + this.balance+"\n");
    }
}
