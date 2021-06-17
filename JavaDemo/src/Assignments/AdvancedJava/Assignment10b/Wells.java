package Assignments.AdvancedJava.Assignment10b;

public class Wells {
    public static void main(String[] args) {
        EmployeeGrade floch = new EmployeeGrade();
        EmployeeGrade hange = new EmployeeGrade(1004,"Hange Zoe",4.6f, 4.5f, 4.3f);

        floch.calculateAverageFeedback();
        floch.calculateGrade();
        floch.displayInfo();

        hange.calculateAverageFeedback();
        hange.calculateGrade();
        hange.displayInfo();
    }
}
