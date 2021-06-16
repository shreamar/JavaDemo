package Assignments.Day5.SelfReview.Review1;

import java.util.Calendar;

abstract class Animal {
    abstract void testClassMethod();
    public static void testInstanceMethod(){
        System.out.println("The instance method in Animal");
    }
}

class Cat extends Animal{
    public void testClassMethod(){
        System.out.println("The class method in Cat.");
    }
    public static void testInstanceMethod(){
        System.out.println("The method in Cat.");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal = cat;
        Animal.testInstanceMethod();
        animal.testClassMethod();
    }
}


