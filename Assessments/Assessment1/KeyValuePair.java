package Assessment1;

import java.util.HashMap;

public class KeyValuePair {
    private HashMap<Integer,String> keyValue = new HashMap<>();
    public void insertKeyValue() {
        keyValue.put(1,"AAA");
        keyValue.put(2,"BBB");
        keyValue.put(3,"CCC");
        keyValue.put(4,"DDD");
        keyValue.put(5,"DDD");

        printValue(3);
    }

    public void printValue(int key){
        System.out.println(keyValue.get(key));
    }

    public static void main(String[] args) {
        KeyValuePair keyValuePair = new KeyValuePair();
        keyValuePair.insertKeyValue();
    }
}
