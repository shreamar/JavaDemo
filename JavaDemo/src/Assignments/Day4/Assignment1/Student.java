package Assignments.Day4.Assignment1;

public class Student {
    //Private attributes
    private int studentId;
    private char studentType;
    private String studentName;
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

    public void setFeesPerMonth(double semesterFee, double hostelFee){
        this.feesPerMonth = semesterFee+hostelFee;
    }

    //Getters
    public int getStudentId(){
        return studentId;
    }

    public  char getStudentType(){
        return studentType;
    }

    public String getStudentName(){
        return studentName;
    }

    public double getFeesPerMonth(){
        return feesPerMonth;
    }
}
