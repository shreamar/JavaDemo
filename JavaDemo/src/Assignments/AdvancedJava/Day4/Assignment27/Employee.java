package Assignments.AdvancedJava.Day4.Assignment27;

import java.util.Calendar;

public class Employee {
    int employeeID;
    String employeeName;
    Calendar dateOfBirth;

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }
}
