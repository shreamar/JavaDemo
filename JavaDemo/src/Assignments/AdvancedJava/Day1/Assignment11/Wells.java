package Assignments.AdvancedJava.Day1.Assignment11;

public class Wells {
    public static void main(String[] args) {
        EmployeeGrade[] employeeGrades = new EmployeeGrade[5];

        for (int i = 0; i<employeeGrades.length; i++){
            employeeGrades[i] = new EmployeeGrade(1003, "Mikasa Ackermann",4.8f, 4.5f, 4.8f);
            employeeGrades[i].calculateAverageFeedback();
            employeeGrades[i].calculateGrade();
            employeeGrades[i].displayInfo();
        }
    }
}
