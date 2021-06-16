package Assignments.Day3.Assignment5;

import java.util.Scanner;

public class User {
    //Private attributes
    private String userName;

    //Setter
    public void setUserName(String name){
        this.userName = name;
    }

    //Getter
    public String getUserName(){
        return userName;
    }

    //Main method
    public static void main(String[] args) {
        User user = new User();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a username: ");
        user.setUserName(scanner.nextLine());

        //Length
        System.out.println("Username length: "+user.getUserName().length());
        //Hi username
        System.out.println("Hi "+user.getUserName());
        //Lowercase
        System.out.println(user.getUserName().toLowerCase());
        //Uppercase
        System.out.println(user.getUserName().toUpperCase());
        //Starting with an 'a'
        if(user.getUserName().toLowerCase().charAt(0) == 'a'){
            System.out.println("The username starts with an 'a'");
        }
        else{
            System.out.println("The username doesn't start with an 'a");
        }

        //Replace username
        user.setUserName("Jaeger");
        System.out.println(user.getUserName());
    }
}
