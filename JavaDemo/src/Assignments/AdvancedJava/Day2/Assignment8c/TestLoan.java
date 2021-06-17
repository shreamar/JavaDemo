package Assignments.AdvancedJava.Day2.Assignment8c;

public class TestLoan {
    public static void main(String[] args) {
        Loan loan = Loan.getLoanInstance(10000322,123,3,121212.23f,2f);
        System.out.println("Total number of objects :"+loan.getNumberofObjects());
    }
}
