package Assignments.Day4.Assignment3;

public class Hostelite extends Student {
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

    //Getters
    public String getHostelName(){
        return hostelName;
    }

    public int getRoomNumber(){
        return roomNumber;
    }

    //Methods
    public void displayStudentDetails(){
        super.displayStudentDetails();
        System.out.print(", Room number: "+roomNumber);
    }
}
