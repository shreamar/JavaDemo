package Assignments.AdvancedJava.Day3.Assignment25;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try {
            Class.forName("Assignments.AdvancedJava.Day3.Assignment25.ExceptionDemo");
        }
        catch (ClassNotFoundException exception){
            System.out.println("Exception: "+exception);
        }
    }
}
