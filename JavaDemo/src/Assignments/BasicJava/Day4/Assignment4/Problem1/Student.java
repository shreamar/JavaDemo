package Assignments.Day4.Assignment4.Problem1;

public class Student {
    protected int studentID;
    protected char studentType;
    protected String studentName;
    protected int semesterFee;
    protected int feesPerMonth;

    Student(int studentID){
        this.studentID = studentID;
    }
    Student(int studentID,char studentType, String studName, int semFees){
        this(studentID);
        this.studentType = studentType;
        studentName =studName;
        semesterFee = semFees;
    }

    void displayDetails(){
        System.out.print("Student ID: "+studentID+", "+studentName+", Type: "+studentType+", Semester fee: $"+semesterFee);
    }
}

class DayScholar extends Student{
    private String residentialAddress;
    DayScholar(int studentID, char studentType, String studName, int semFees, String residentialAddress){
        super(studentID, studentType, studName, semFees);
        this.residentialAddress = residentialAddress;
    }

    void displayDetails(){
        super.displayDetails();
        System.out.print(", Residential address: "+residentialAddress);
    }
}

class CourseReg{
    public static void main(String[] args) {
        DayScholar dayScholar = new DayScholar(1001,'D',"Eugene",12000, "Scout Regiment Headquarters, Trost District");
        dayScholar.displayDetails();
    }
}
