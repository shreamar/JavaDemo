package Assignments.Day4.Assignment8;

public abstract class Student {
    //Private attributes
    protected int studentId;
    protected char studentType;
    protected String studentName;
    protected double feesPerMonth;

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

    //Methods
    public void displayStudentDetails(){
        System.out.print("Student ID: "+studentId+", "+studentName+", Type: "+studentType+", Fees/month: $"+feesPerMonth);
    }

    //Abstract method
    public abstract void calculateFees(double feesPerMonth);

    //Main method
    public static void main(String[] args) {
        Student student;
        //args[4] is for residential status; hostelite or day scholar
        if(args[4].equalsIgnoreCase("hostelite")){
            student = new Hostelite(Integer.parseInt(args[0]),args[1].charAt(0),args[2],args[3],Double.parseDouble(args[5]),args[6],Integer.parseInt(args[7]));
        }
        else{
            student = new DayScholar(Integer.parseInt(args[0]),args[1].charAt(0),args[2],args[3],Double.parseDouble(args[5]),args[6]);
        }

        student.displayStudentDetails();
    }
}
