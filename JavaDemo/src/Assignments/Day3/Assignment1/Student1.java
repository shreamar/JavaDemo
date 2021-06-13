package Assignments.Day3.Assignment1;

public class Student1 {
    //Private attributes
    private static int studentCount;
    private int studentId;
    private char studentType;
    private String studentName;

    static{
        studentCount = 10;
    }

    //Default constructor
    public Student1(){
        this.studentCount++;
        this.studentId = this.studentCount;
    }

    //Parameterized constructor
    public Student1(char sType, String fname, String lname){
        this();
        this.studentName = fname+" "+lname;
        this.studentType = sType;
    }

    public void displayDetails(Student1 student){
        System.out.println("Student ID: "+student.studentId+", Name: "+student.studentName+", Student type: "+student.studentType);
    }

    public static int getStudentCount(){
        return studentCount;
    }

    //Main method
    public static void main(String[] args) {
        Student1 studentOne  = new Student1('D',"Bony","Thomas");
        studentOne.displayDetails(studentOne);
        Student1 studentTwo = new Student1('H',"Dinil","Bose");
        studentTwo.displayDetails(studentTwo);
    }
}

