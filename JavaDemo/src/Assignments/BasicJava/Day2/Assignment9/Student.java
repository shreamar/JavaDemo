package Assignments.Day2.Assignment9;

public class Student {
    //Private attributes
    private static int studentId = 549;
    private char studentType;
    private String studentName;

    //Default constructor
    public Student(){
        this.studentId++;
    }

    //Parameterized constructor
    public Student(char sType, String fname, String lname){
        this();
        this.studentName = fname+" "+lname;
        this.studentType = sType;
    }

    public void displayDetails(Student student){
        System.out.println("Student ID: "+student.studentId+", Name: "+student.studentName+", Student type: "+student.studentType);
    }

    //Main method
    public static void main(String[] args) {
        Student studentOne  = new Student('D',"Bony","Thomas");
        studentOne.displayDetails(studentOne);
        Student studentTwo = new Student('H',"Dinil","Bose");
        studentTwo.displayDetails(studentTwo);
    }
}
