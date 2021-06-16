package Assignments.Day4.Assignment7;

import javax.swing.text.Style;

public class Student {
    protected int studentID;
    protected char studentType;
    protected String studentName;
    protected final double semesterFee = 1200;
    protected double feesPerMonth;

    Student(){
        calculateFees();
    }

    public void setStudentID(int sID){
        this.studentID = sID;
    }
    public void setStudentType(char studentType){
        this.studentType =studentType;
    }
    public void setStudentName(String name){
        this.studentName = name;
    }
    public void calculateFees(){
        this.feesPerMonth = semesterFee/6.0;
    }
    public final void displayDetails(){
        System.out.println("Student ID: "+studentID);
        System.out.println("Student Type: "+studentType);
        System.out.println("Student Name: "+studentName);
        System.out.println("Fees/month : $"+feesPerMonth);
    }
}
