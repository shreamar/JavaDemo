package Assignments.AdvancedJava3.Assignment2;

import java.io.*;

public class CustomerFileDB {
    String file = "customer.ser";

    public int saveCustomer(Customer customer){
        int status = -1;
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(customer);
            status = 0;
        }
        catch (IOException ioException){
            status = -2;
            ioException.printStackTrace();
        }
        finally {
            if(null != objectOutputStream){
                try{
                    objectOutputStream.close();
                }
                catch (IOException ioException){
                    ioException.printStackTrace();
                }
            }
            if(null != fileOutputStream){
                try{
                    fileOutputStream.close();
                }
                catch (IOException ioException){
                    ioException.printStackTrace();
                }
            }

        }
        return  status;
    }

    public Customer getCustomer(int customerID){

        Customer customer = null;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try{
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);

            do{
                customer = (Customer)objectInputStream.readObject();

                if(customer.getCustomerID() == (customerID)) break;
                else customer = null;

            }while (fileInputStream.available()>0);
        }catch (ClassNotFoundException exception){
            exception.printStackTrace();
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
        finally {
            if(null != objectInputStream){
                try{
                    objectInputStream.close();
                }
                catch (IOException ioException){
                    ioException.printStackTrace();
                }
            }
            if(null != fileInputStream){
                try{
                    fileInputStream.close();
                }
                catch (IOException ioExeption){
                    ioExeption.printStackTrace();
                }
            }
        }
        return customer;
    }
}
