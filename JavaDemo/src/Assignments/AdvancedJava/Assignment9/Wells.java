package Assignments.AdvancedJava.Assignment9;

public class Wells {
    public static void main(String[] args) {
        EmployeeGrade historia =  new EmployeeGrade();
        historia.initializeEmployee(1102,"Historia Reiss",4.3f,3.9f, 4.2f);
        historia.calculateAverageFeedback();
        historia.calculateGrade();
        historia.displayInfo();

        EmployeeGrade ymir = new EmployeeGrade();
        ymir.initializeEmployee(1103,"Ymir Fritz",3.2f, 3.1f);
        ymir.calculateAverageFeedback();
        ymir.calculateGrade();
        ymir.displayInfo();
    }
}
