package tutorial.java.serialization.runApp;

import tutorial.java.serialization.model.RetailAccount;

import java.io.*;

public class RetailAccountCustomizedSerializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        RetailAccount a1 = new RetailAccount();
        //Seriailization
        FileOutputStream fileOutputStream = new FileOutputStream("acc.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(a1);

        System.out.println(a1.getUsername() + "..." + a1.getPwd() + "..." + a1.getGender() + "..." + a1.isJoint() + "..." + a1.getPin());


        //Deserialization
        FileInputStream fileInputStream = new FileInputStream("acc.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        RetailAccount a2 = (RetailAccount)objectInputStream.readObject();

        System.out.println(a2.getUsername() + "..." + a2.getPwd() + "..." + a2.getGender() + "..." + a2.isJoint() + "..." + a2.getPin());
    }
}
