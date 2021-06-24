package Assignments.AdvancedJava3.Assignment2;

import java.io.*;

public class AccountFileDB {
    String file = "account.ser";

    public int saveAccount(Account account){
        int status = -1;
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try{
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(account);
            status = 0;
        }
        catch (IOException exception){
            status = -2;
            exception.printStackTrace();
        }
        finally {
            if(objectOutputStream != null){
                try{
                    objectOutputStream.close();
                }
                catch (IOException exception){
                    exception.printStackTrace();
                }
            }
            if(fileOutputStream != null){
                try{
                    fileOutputStream.close();
                }
                catch (IOException exception){
                    exception.printStackTrace();
                }
            }
        }
        return status;
    }

    public Account getAccount(int accountID){
        Account account = null;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try{
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);

            do{
                account = (Account)objectInputStream.readObject();

                if(account.getAccountNo() == accountID) break;
                else account = null;
            }while (fileInputStream.available()>0);
        }
        catch (ClassNotFoundException | IOException exception){
            exception.printStackTrace();
        }
        finally {
            if(objectInputStream != null){
                try{
                    objectInputStream.close();
                }
                catch (IOException exception){
                    exception.printStackTrace();
                }
            }
            if(fileInputStream != null){
                try{
                    fileInputStream.close();
                }
                catch (IOException exception){
                    exception.printStackTrace();
                }
            }
        }
        return account;
    }
}
