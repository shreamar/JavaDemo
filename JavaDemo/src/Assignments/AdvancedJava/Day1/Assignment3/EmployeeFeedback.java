package Assignments.AdvancedJava.Day1.Assignment3;

public class EmployeeFeedback {
    public static void main(String[] args) {
        int[][] empInfo = {{1001,4,5},{1002,2,4,5},{1003, 4, 5, 5, 4, 4, 5}};

        for(int row  = 0 ; row < empInfo.length; row++){
            System.out.print("Employee ID: "+empInfo[row][0]+", Ratings: ");
            for(int col  = 1; col < empInfo[row].length; col++){
                System.out.print(empInfo[row][col]+" ");
            }
            System.out.println();
        }
    }
}
