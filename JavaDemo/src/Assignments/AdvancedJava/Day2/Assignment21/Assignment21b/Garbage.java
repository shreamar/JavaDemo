package Assignments.AdvancedJava.Day2.Assignment21.Assignment21b;

public class Garbage {
    String garbageLocation;
    Garbage garbage;

    public static void main(String[] args) {
        Garbage garbage1 = new Garbage();
        garbage1.garbage = new Garbage();
        garbage1.garbageLocation = "MyScore";
        garbage1.garbage.garbageLocation = "GarbageLocation";
        garbage1.garbage.garbage = garbage1; //2 objects are created
        garbage1.garbage.garbage = null;     //0 object garbage collected
        garbage1.garbage = null;             //2 object garbage collected
        garbage1 = null;                     //remaining 1 object garbage collected
    }
}
