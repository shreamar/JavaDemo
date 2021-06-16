package Assignments.Day4.Review.Review1;

public class Child extends Parent {
    private int val;
    public void setVal(int num){
        val = num;
    }
    public int getVal(){
        return val;
    }
    public void display(){
        System.out.println("Number :"+super.getNum());
        System.out.println("Value :"+val);
    }
}
