package Assignments.AdvancedJava.Day4.Assignment33;

public class StringMock {
    String capacity;
    public StringMock(){

    }

    public StringMock(String capacity){
        this.capacity =capacity;
    }

    /**
     *
     * @param string
     * @param searchItem
     * @return
     */
    @Deprecated
    public static int search (String string, char searchItem){
        int index;
        char[] charArray = string.toCharArray();
        for (index = 0; index < charArray.length; index++) {
            if(charArray[index] == searchItem) return index;
        }
        return -1;
    }
}
