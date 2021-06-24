package Assignments.AdvancedJava3.Assignment3;

import Assignments.AdvancedJava3.Assignment2.ReadData;

import java.io.*;

public class Debug {
    public static void main(String[] args) {
        Customer customer = new Customer(1001, "Mikasa");
        SavingAccount sb1 = new SavingAccount(9001, customer,2000,5,1000);

        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try{
            fileOutputStream = new FileOutputStream("data.ser");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(sb1);
            objectOutputStream.close();
            System.out.println("Data successfully saved to file.\n");
            System.out.println("<Press any key to deserialize...>");
            ReadData.acceptString();
        }
        catch (IOException ioException){
            ioException.printStackTrace();
        }

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            fileInputStream = new FileInputStream("data.ser");
            objectInputStream = new ObjectInputStream(fileInputStream);
            SavingAccount deserializedSb = (SavingAccount)objectInputStream.readObject();
            System.out.println("Deserializing successful.");
        }
        catch (IOException | ClassNotFoundException exception){
            exception.printStackTrace();
        }

    }
}
