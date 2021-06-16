package Assignments.Day4.Assignment5;

public class Student {
    protected static int studentID;
    protected char studentType;
    protected String studentName;

    Student(){
        studentID++;
    }

    Student(int id, char type, String name){
        this();
        studentID = id;
        studentType = type;
        studentName = name;
    }
}
