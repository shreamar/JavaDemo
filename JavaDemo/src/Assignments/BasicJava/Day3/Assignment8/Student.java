package Assignments.Day3.Assignment8;

public class Student {
    //Private attributes
    private int studentId;
    private char studentType;
    private String studentName;
    private String residentialStatus;
    private double feesPerMonth;

    //Constructors
    public Student(){
        this.studentId = 10;
    }

    public Student(int id, char type, String fname, String lname){
        this.studentId = id;
        this.studentType = type;
        this.studentName = fname+" "+lname;
    }

    //Setters
    public void setStudentId(int id){
        this.studentId = id;
    }

    public void setStudentName(String firstName, String lastName){
        this.studentName = firstName+ " "+lastName;
    }

    public void setStudentType(char type){
        this.studentType =type;
    }

    public void setResidentialStatus(String status){
        this.residentialStatus = status;
    }

    public void setFeesPerMonth(double semesterFee, double hostelFee){
        this.feesPerMonth = semesterFee+hostelFee;
    }

    //Getters
    public int getStudentId(){
        return studentId;
    }

    public String getStudentName(){
        return studentName;
    }

    public String getResidentialStatus(){
        return residentialStatus;
    }

    public double getFees(){
        return feesPerMonth;
    }

    //Overloaded Methods
    public void calculateFees(double semesterFee){
        this.feesPerMonth = semesterFee/6.0;
    }

    public  void calculateFees(double semesterFee, double hostelFee){
        this.feesPerMonth = semesterFee/6.0;
        this.feesPerMonth = this.feesPerMonth + hostelFee;
    }

    //Main method
    public static void main(String[] args) {
        Student student;
        student = new Student(24,'F',"Anna","Yeager");
        student.setResidentialStatus("HostElite");

        if(student.getResidentialStatus().equalsIgnoreCase("hostelite")){
            student.calculateFees(6000,600);
        }
        else {
            student.calculateFees(6000);
        }

        System.out.println("StudentID: "+student.getStudentId()+", "+student.getStudentName()+", Residential Status: "+student.getResidentialStatus()+", Fees/month: $"+student.getFees());

    }
}
