package Assignments.AdvancedJava2.Day1.Assignment3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LoginDetails {
    public void addSameKey(Map<Integer,String> map){
        if(map.containsKey(1003)){
            System.out.println("Key is already present in map");
        }
        else {
            map.put(1003,"Connie");
        }
    }

    public void printLoginDetails(Map<Integer,String> map){
        Set<Integer> set = map.keySet();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<Integer, String>();
        map.put(1000,"Mikasa");
        map.put(1001,"Reiner");
        map.put(1002,"Bertholdt");
        map.put(1003,"Annie");
        System.out.println("Map before adding the same key 1003 "+map);

        LoginDetails loginDetails = new LoginDetails();
        loginDetails.addSameKey(map);
        System.out.println("Value for 1003, after addSameKey() : "+map.get(1003));
        System.out.println("Map after adding the same key 1003 "+map);
        loginDetails.printLoginDetails(map);
    }
}
