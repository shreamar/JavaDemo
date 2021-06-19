package Assignments.AdvancedJava.Day4.Assignment31;

import java.util.ArrayList;

public class EmployeeInfo {
    public static void main(String[] args) {
        ArrayList employeeID = new ArrayList();
        employeeID.add(1001);
        employeeID.add(1002);
        employeeID.add("1003");

        for(int count =0;count<employeeID.size();count++){
            System.out.println("ID: "+employeeID.get(count));
        }
    }
}
