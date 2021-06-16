package Assignments.Day4.Assignment4.Problem2;

class CourseRegistration {
    static protected int regID;
    protected String courseName;
    CourseRegistration(){
        regID++;
    }
    CourseRegistration(String cName){
        this();
        courseName = cName;
    }

    public void displayDetails(){
        System.out.println("Registration ID :"+regID);
        System.out.println("CourseName :"+courseName);
    }
}

class Students extends CourseRegistration{
    protected int studentID;
    protected char studentType;
    protected String studentName;
    private int semesterFees;
    private int feesPerMonth;
    Students(int studentID, String cName){
        super(cName);
        this.studentID = studentID;
    }
    Students(int studentID, char studentType, String studentName, int semFees, String cName){
        this(studentID,cName);
        this.studentType =studentType;
        this.studentName = studentName;
        this.semesterFees = semFees;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.print("Student ID: "+studentID+", "+studentName+", Type: "+studentType+", Semester fee: $"+semesterFees);
    }
}

class DayScholars extends Students{
    private String residentialAddress;
    DayScholars(int studentID, char studentType, String studentName, int semFees, String residentialAddress, String cName){
        super(studentID, studentType,studentName,semFees,cName);
        this.residentialAddress = residentialAddress;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.print(", Residential address: "+residentialAddress);
    }
}

class CourseRegs{
    public static void main(String[] args) {
        DayScholars dayScholar = new DayScholars(1001,'D',"Levi", 12000,"Scout Regiment HQ, Trost District","ODM Training");
        dayScholar.displayDetails();
    }
}
