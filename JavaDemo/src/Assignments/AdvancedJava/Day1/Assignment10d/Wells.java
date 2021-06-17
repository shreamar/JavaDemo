package Assignments.AdvancedJava.Day1.Assignment10d;

public class Wells {
    public static void main(String[] args) {
        EmployeeGrade floch = new EmployeeGrade();
        EmployeeGrade hange = new EmployeeGrade(1103, "Hange Zoe", 4.5f, 4.6f,4.7f);

        hange.calculateAverageFeedback();
        hange.calculateGrade();
        hange.displayInfo();
    }
}
