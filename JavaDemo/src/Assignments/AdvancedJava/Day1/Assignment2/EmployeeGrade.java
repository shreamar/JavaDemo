package Assignments.AdvancedJava.Day1.Assignment2;

public class EmployeeGrade {
    public static void main(String[] args) {
        int[] employeeID = {1001,1002,1003,1004, 1005};
        float[] customer1Feedback = {4.1f, 2.3f, 4.4f, 3.5f, 5.0f};
        float[] customer2Feedback = {3.4f, 2.5f, 4.6f, 3.7f, 4.8f};
        float[] cusotmer3Feedback = {3.6f, 2.2f, 5.0f, 4.0f, 4.8f};

        float[] averageFeedback = new float[employeeID.length];
        char[] grade = new char[employeeID.length];

        for(int i = 0; i < employeeID.length; i++){
            averageFeedback[i] = (cusotmer3Feedback[i]+customer2Feedback[i]+customer1Feedback[i])/3.0f;

            if(averageFeedback[i] >= 4.5){
                grade[i] = 'A';
            }
            else if(averageFeedback[i] >=4 && averageFeedback[i]<4.5){
                grade[i] = 'B';
            }
            else if(averageFeedback[i] >=3.5 && averageFeedback[i]<4){
                grade[i] = 'C';
            }
            else if(averageFeedback[i] >= 3 && averageFeedback[i]<3.5){
                grade[i] = 'D';
            }
            else if(averageFeedback[i]>=2 && averageFeedback[i]<3){
                grade[i] = 'E';
            }
            else if(averageFeedback[i]<2){
                grade[i] = 'F';
            }

            System.out.println("Employee ID: "+employeeID[i]+", Average feedback : "+averageFeedback[i]+"/5, Grade: "+grade[i]);
        }
    }
}
