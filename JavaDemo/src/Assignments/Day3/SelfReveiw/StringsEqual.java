package Assignments.Day3.SelfReveiw;

public class StringsEqual {
    public static void main(String[] args) {
        String name1, name2;
        name1 = new String("Erwin Smith");
        name2 = new String("Erwin Smith");
        if(name1.equals(name2)){
            System.out.println("Equals");
        }
        else {
            System.out.println("Not Equal");
        }
    }
}
