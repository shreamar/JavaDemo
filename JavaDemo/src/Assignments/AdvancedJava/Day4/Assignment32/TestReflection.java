package Assignments.AdvancedJava.Day4.Assignment32;

import java.lang.reflect.*;

public class TestReflection {
    public static void main(String[] args) {
        try {
            Class classObj = Class.forName("Assignments.AdvancedJava.Day4.Assignment32.Employee");
            for (Method method:classObj.getDeclaredMethods()) {
                System.out.println(method);
            }
            System.out.println();
            for (Field field :
                    classObj.getDeclaredFields()) {
                System.out.println(field);
            }
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
