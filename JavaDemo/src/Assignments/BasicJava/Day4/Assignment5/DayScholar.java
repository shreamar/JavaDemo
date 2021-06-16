package Assignments.Day4.Assignment5;

public class DayScholar extends PostGradStudent{
    private String residentialAddress;
    private int fees;

    DayScholar(int courseID, String courseName, int courseFee, int studentID, char studentType, String studentName, String residentialAddress){
        super(courseID,courseName,courseFee,studentID,studentType,studentName);
        this.residentialAddress = residentialAddress;
    }


    public void calculateFees(){
        fees = postCourseFees/6;
    }

    public int getFees(){
        calculateFees();
        return fees;
    }

    public static void main(String[] args) {
        DayScholar dayScholar = new DayScholar(5,"ODM training",16000,1001,'D',"Jean", "Scout Regiment HQ, Trost District");

        System.out.println("Post Gradudate Course ID: "+dayScholar.getPostCourseID());
        System.out.println("Course name: "+dayScholar.getPostCourseName());
        System.out.println("Student ID:"+dayScholar.studentID+", "+dayScholar.studentName+", Type: "+dayScholar.studentType+", Residential address: "+dayScholar.residentialAddress+", Fees/month: $"+dayScholar.getFees());
    }
}
