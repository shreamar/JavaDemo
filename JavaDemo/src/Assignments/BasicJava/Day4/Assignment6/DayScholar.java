package Assignments.Day4.Assignment6;

public class DayScholar extends Student {
    private String residentialAddress;

    public void setResidentialAddress(String address){
        this.residentialAddress = address;
    }
    public void getDetails(){
        super.getDetails();
        System.out.println("Student name: "+studentName);
        System.out.println("Residential address: "+residentialAddress);
    }
}
