package Assignments.Day4.Assignment6;

public class DynamicEx {
    public static void main(String[] args) {
        Student dayScholar = new DayScholar();
        dayScholar.setStudentID(1001);
        dayScholar.setStudentType('D');
        dayScholar.setStudentName("Sasha Braus");
        ((DayScholar)dayScholar).setResidentialAddress("Drauper Village, Wall Rose");
        dayScholar.getDetails();
    }
}
