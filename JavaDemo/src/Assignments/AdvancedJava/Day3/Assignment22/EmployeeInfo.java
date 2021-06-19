package Assignments.AdvancedJava.Day3.Assignment22;

import java.util.Vector;

public class EmployeeInfo {
    public static void main(String[] args) {
        Vector<Integer> empList = new Vector<Integer>();
        int empNo = 1000;
        for(int count = 0; count<5; count++){
            empNo++;
            Integer empNo1 = empNo;
            empList.add(empNo1);
        }
        for (Integer num: empList) {
            int number = num;
            System.out.print(number+" - ");
        }
    }
}
