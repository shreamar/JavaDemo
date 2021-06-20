package Assignments.AdvancedJava2.Day1.Assignment4;

import java.util.LinkedHashMap;
import java.util.Map;

public class Login {
    private Map<Integer,String> loginMap = new LinkedHashMap<>();

    public void addLogin(int customerID, String password){
        loginMap.put(customerID,password);
    }
}
