package Assignments.AdvancedJava.Assignment8;

public class Wells {
    public static void main(String[] args) {
        EmployeeGrade eren = new EmployeeGrade();
        eren.initializeEmployee(1001,"Eren Jaeger",3.5f, 3.6f, 3.9f);
        eren.calculateAverageFeedback();
        eren.calculateGrade();
        eren.displayInfo();
    }
}
