package Assignments.Day3.Assignment7;

public class Student3 {
    //Private attributes
    private int studentId;
    private String studentName;
    private String residentialStatus;
    private long feesPerMonth;

    //Constructors
    public Student3(){
        this.studentId = 10;
    }

    //Setters
    public void setStudentId(int id){
        this.studentId = id;
    }

    public void setStudentName(String firstName, String lastName){
        this.studentName = firstName+ " "+lastName;
    }

    public void setResidentialStatus(String status){
        this.residentialStatus = status;
    }

    public void setFeesPerMonth(int semesterFee, int hostelFee){
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

    public long getFeesPerMonth(){
        return feesPerMonth;
    }

    //Main method
    public static void main(String[] args) {
        int studentID;
        String firstName, lastName, residentialStatus;
        int semesterFee, hostelFee;

        Student3 student = new Student3();

        studentID = Integer.parseInt(args[0]);
        student.setStudentId(studentID);

        firstName = args[1];
        lastName = args[2];
        student.setStudentName(firstName,lastName);

        residentialStatus = args[3];
        student.setResidentialStatus(residentialStatus);

        semesterFee = Integer.parseInt(args[4]);
        if(residentialStatus.toLowerCase().equals("hostelite")){
            hostelFee = Integer.parseInt(args[5]);
            student.setFeesPerMonth(semesterFee,hostelFee);
        }
        else{
            student.setFeesPerMonth(semesterFee,0);
        }

        System.out.println("StudentID: "+student.getStudentId()+", "+student.getStudentName()+", Residential Status: "+student.getResidentialStatus()+", Fees/month: $"+student.getFeesPerMonth());
    }
}
