package Assignments.Day4.Assignment2;

public class Hostelite extends Student{
    //Private methods
    private String hostelName;
    private int roomNumber;

    //Constructors
    public Hostelite(){
        super();
    }

    public Hostelite(int id, char type, String fname, String lname, double fees, String hostelName, int roomNumber){
        super(id,type,fname,lname);
        this.feesPerMonth = fees;
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
    }

    //Methods
    public String getHostelName(){
        return hostelName;
    }

    public int getRoomNumber(){
        return roomNumber;
    }

    //Main method
    public static void main(String[] args) {
        Hostelite student = new Hostelite(24, 'F',"Anna", "Yeager", 1600,"Scout Regiment", 9);
        System.out.println("StudentID: "+student.getStudentId()+", "+student.getStudentName()+", Type: "+student.getStudentType()+", Hostel name: "+student.getHostelName()+", Fees/month: $"+student.getFeesPerMonth());
    }
}
