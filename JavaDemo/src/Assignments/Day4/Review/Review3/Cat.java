package Assignments.Day4.Review.Review3;

public class Cat extends Animal {
    public static void testClassMethod(){
        System.out.println("The class method in Cat.");
    }
    public void testIntanceMethod(){
        System.out.println("The instance method in Cat.");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal = cat;
        Animal.testClassMethod();
        animal.testInstanceMethod();
    }
}
