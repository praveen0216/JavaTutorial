package tutorial.java.serialization.runApp;

import tutorial.java.serialization.model.Dog;

import java.io.*;

public class SerializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog d = new Dog();

        //Seriailization
        FileOutputStream fileOutputStream = new FileOutputStream("dog.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(d);

        //Deserialization
        FileInputStream fileInputStream = new FileInputStream("dog.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Dog dog = (Dog)objectInputStream.readObject();

        //Output
        System.out.println(dog.i + " .  . " + dog.j);
    }
}
