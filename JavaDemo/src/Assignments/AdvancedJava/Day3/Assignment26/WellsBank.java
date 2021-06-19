package Assignments.AdvancedJava.Day3.Assignment26;

import Assignments.AdvancedJava.Day2.Assignment17.Customer;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class WellsBank {

    /**
     * Calls the deposit method of the respective account type
     * @param account
     * @param amount
     */
    public static void transaction(Account account, double amount){
        account.deposit(amount);
        //account.withdraw(100);
    }

    public static void main(String[] args) {
        Customer levi = new Customer(1001, "Levi Ackermann","Scout Regiment HQ, Trost district",1234);

        try {
            SavingsAccount leviSA = new SavingsAccount(101, levi, 1000);
            leviSA.withdraw(10000);
        }
        catch (InsufficientBalanceException exception){
            System.out.println(exception.getMessage());
        }


        Customer erwin = new Customer(1002, "Erwin Smith","Scout Regiment HQ, Trost district",4321);

        try {
            CurrentAccount erwinCA = new CurrentAccount(102, erwin, 500, 2000);
            erwinCA.withdraw(10000);
        }
        catch (InsufficientBalanceException exception){
            System.out.println(exception.getMessage());
        }
    }
}
