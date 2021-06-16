package Assignments.CaseStudies.CaseStudy1;

public class MinAccountBalValidation {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccAmount(5000);

        if(account.getAccAmount()<500){
            System.out.println("The account balance is below minimum value.");
        }
        else{
            System.out.println("Your balance is : $"+account.getAccAmount());
        }
    }
}
