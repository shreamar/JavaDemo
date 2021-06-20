package Assignments.AdvancedJava2.Day1.Assignment5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Debug {
    public void showRecards(Set<String> set){
        if(!set.isEmpty()){
            Iterator<String> iterator = set.iterator();
            while (iterator.hasNext()){
                System.out.println((iterator.next()));
            }
        }
        else {
            System.out.println("Set is an empty set");
        }
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Sasha");
        set.add("Historia");
        set.add("Ymir");
        set.add("Mina");
        Debug debug = new Debug();
        System.out.println("Printing the records....");
        debug.showRecards(set);
    }
}
