package Assignments.Day4.Assignment6;

public class Student {
    protected int studentID;
    protected char studentType;
    protected String studentName;
    public void setStudentID(int sID){
        this.studentID = sID;
    }
    public void setStudentType(char studentType){
        this.studentType =studentType;
    }
    public void setStudentName(String name){
        this.studentName = name;
    }
    public void getDetails(){
        System.out.println("Student ID: "+studentID);
        System.out.println("Student Type: "+studentType);
    }
}
