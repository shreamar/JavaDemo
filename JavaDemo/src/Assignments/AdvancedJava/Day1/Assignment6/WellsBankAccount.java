package Assignments.AdvancedJava.Day1.Assignment6;

public class WellsBankAccount {
    private String firstName;
    private String middleName;
    private String lastName;
    private String emailID;
    private char accountType;
    private String dateOfBirth;
    private char gender;
    private char maritalStatus;

    WellsBankAccount(String fName, String mName, String lName, String email, char accountType, String dateOfBirth, char gender, char maritalStatus){
        this.firstName = fName;
        this.middleName = mName;
        this.lastName = lName;
        this.emailID = email;
        this.accountType = accountType;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public static void main(String[] args) {
        WellsBankAccount employee1 = new WellsBankAccount("Paul", "J","Anderson","paul@wellsfargo.com",'S',"3rd Jan, 1985",'M','S');
        WellsBankAccount employee2 = new WellsBankAccount("John", "", "Jacob","john@wellsfargo.com",'N',"6th March, 1985",'M','M');
        
    }
}
