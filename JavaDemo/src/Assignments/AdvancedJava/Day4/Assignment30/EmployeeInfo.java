package Assignments.AdvancedJava.Day4.Assignment30;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EmployeeInfo {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        int id = 1001;
        List list = new ArrayList();
        for (Employee emp: employees) {
            emp = new Employee();
            emp.setEmployeeID(id++);
            list.add(emp);
        }

        ListIterator<Employee> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println("EmployeeID: "+iterator.next().getEmployeeID());
        }
    }
}
