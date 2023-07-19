package tutorial.java.serialization.runApp;


import tutorial.java.serialization.model.Elephant;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationWithInheritanceCase1Demo {

    /**
     * This code shows the behavior of Serialization w.r.t inheritance
     *
     * Case 1: When parent class implements Serializable and child class does not
     *
     * Animal class (Parent class) implements Serializable
     * But Elephant (Child class) does not implements Serializable
     * Still Elephant class object is serialized due to it parent class
     *
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        Elephant elephant = new Elephant();

        //Seriailization
        FileOutputStream fileOutputStream = new FileOutputStream("elephant.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(elephant);

        System.out.println(elephant.getI() + " .  . " + elephant.getJ());

        //Deserialization
        FileInputStream fileInputStream = new FileInputStream("elephant.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Elephant read = (Elephant)objectInputStream.readObject();

        //Output
        System.out.println(read.getI() + " .  . " + read.getJ());
    }
}
