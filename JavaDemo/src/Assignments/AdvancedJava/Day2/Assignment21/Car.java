package Assignments.AdvancedJava.Day2.Assignment21;

import javax.lang.model.element.TypeElement;

class Tyre{}

public class Car {
    Tyre tyre;
    String name;

    public static void main(String[] args) {
        Car car = new Car();
        car.setFeatures(car);
    }

    void setFeatures(Car car){
        tyre = new Tyre();
        car.setName("Swift");
    }

    void setName(String name){
        this.name = name;
    }
}
