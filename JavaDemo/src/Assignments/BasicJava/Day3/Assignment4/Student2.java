package Assignments.Day3.Assignment4;

public class Student2 {
    //Private attributes
    private int studentId;
    private char studentType;
    private String studentName;

    //Constructors
    public Student2(){
        this.studentId = 10;
        this.studentType = 'F';
    }

    public Student2(int id, char type, String fname, String lname){
        this.studentId = id;
        this.studentType = type;
        this.studentName = fname+ " "+lname;
    }

    //Setters
    public void setStudentId(int id){
        this.studentId = id;
    }

    public void setStudentType(char type){
        this.studentType = type;
    }

    public void setStudentName(String firstName, String lastName){
        this.studentName = firstName+ " "+lastName;
    }

    //Getters
    public int getStudentId(){
        return studentId;
    }

    public char getStudentType(){
        return studentType;
    }

    public String getStudentName(){
        return studentName;
    }

    //Main method
    public static void main(String[] args) {
        Student2 student = new Student2();
        student.setStudentId(24);
        student.setStudentType('F');
        student.setStudentName("Anna","Jaeger");

        System.out.println("StudentID: "+student.getStudentId()+ ", "+ student.getStudentName()+ ", Student type: "+student.getStudentType());

        Student2 student2 = new Student2(19, 'F', "Mikasa","Ackermann");
        System.out.println("StudentID: "+student2.getStudentId()+ ", "+ student2.getStudentName()+ ", Student type: "+student2.getStudentType());
    }
}
