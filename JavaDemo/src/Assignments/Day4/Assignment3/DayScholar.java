package Assignments.Day4.Assignment3;

public class DayScholar extends Student{
    //Private attributes
    private String residentialAddress;

    //Constructor
    public DayScholar(){

    }

    public DayScholar(int id, char type, String fname, String lname, double fees, String address){
        super(id,type,fname,lname);
        this.feesPerMonth = fees;
        this.residentialAddress = address;
    }

    public String getResidentialAddress(){
        return residentialAddress;
    }

    public void displayStudentDetails(){
        super.displayStudentDetails();
        System.out.print(", Residential address: "+residentialAddress);
    }
}
