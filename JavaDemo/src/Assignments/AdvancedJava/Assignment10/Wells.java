package Assignments.AdvancedJava.Assignment10;

public class Wells {
    public static void main(String[] args) {
        EmployeeGrade pieck = new EmployeeGrade(1003, "Pieck Finger",4.8f, 4.9f, 5.0f);
        pieck.calculateAverageFeedback();
        pieck.calculateGrade();
        pieck.displayInfo();            
    }
}
