package Assignments.AdvancedJava2.Day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddCustomer {
    public void printCustomers(List<String> arrayList){
        Iterator<String> iterator = arrayList.iterator();
        System.out.println("Customers are: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Levi");
        list.add("Erwin");
        list.add("Hange");
        list.add("Miche");
        AddCustomer addCustomer = new AddCustomer();
        addCustomer.printCustomers(list);
    }
}
