package Assignments.Day4.Assignment5;

public class PostGradStudent extends Student {
    protected int postCourseID;
    protected String postCourseName;
    protected int postCourseFees;

    PostGradStudent(int courseID, String courseName, int courseFee, int studentID, char studentType, String studentName){
        super(studentID,studentType,studentName);
        postCourseID = courseID;
        postCourseName = courseName;
        postCourseFees = courseFee;
    }

    public int getPostCourseID(){
        return postCourseID;
    }

    public String getPostCourseName(){
        return postCourseName;
    }
}
