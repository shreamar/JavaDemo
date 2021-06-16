package Assignments.Day4.Assignment7;

public final class DayScholar extends Student {
    private String residentialAddress;

    DayScholar(){

    }

    DayScholar(int studentID, char studentType, String studentName,  String address){
        setStudentID(studentID);
        setStudentType(studentType);
        setStudentName(studentName);
        this.residentialAddress = address;
    }

    public void displayDaySDetails(){
        super.displayDetails();
        System.out.println("Residential address: "+residentialAddress);
    }

    public static void main(String[] args) {
        DayScholar dayScholar = new DayScholar(1001, 'D',"Connie Springer","Ragako Village, Wall Rose");
        dayScholar.displayDaySDetails();
    }
}
