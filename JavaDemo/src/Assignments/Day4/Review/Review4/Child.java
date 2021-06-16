package Assignments.Day4.Review.Review4;

public class Child extends Parent {
    private int val;
    Child(int num, int val){
        //To invoke super class constructor
        super(num);
        this.val =val;
    }
    public int getVal(){
        return val;
    }
}
