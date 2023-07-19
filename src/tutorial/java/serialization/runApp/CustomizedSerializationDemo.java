package tutorial.java.serialization.runApp;

import tutorial.java.serialization.model.Account;
import tutorial.java.serialization.model.Dog;

import java.io.*;

public class CustomizedSerializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Account a1 = new Account();
        //Seriailization
        FileOutputStream fileOutputStream = new FileOutputStream("acc.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(a1);

        System.out.println(a1.getUsername() + "..." + a1.getPassword());


        //Deserialization
        FileInputStream fileInputStream = new FileInputStream("acc.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Account a2 = (Account)objectInputStream.readObject();

        System.out.println(a2.getUsername() + "..." + a2.getPassword());
    }
}
