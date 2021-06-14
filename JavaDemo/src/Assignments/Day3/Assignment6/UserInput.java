package Assignments.Day3.Assignment6;

public class UserInput {
    public static void main(String[] args) {
        int number, interations;

        number = Integer.parseInt(args[0]);
        interations = Integer.parseInt(args[1]);

        for (int i =1; i<=interations; i++){
            System.out.println(number+" * "+i+" = "+i*number);
        }
    }
}
