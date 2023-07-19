package tutorial.java.serialization.externalization;

import tutorial.java.serialization.model.ExternalizableClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizationDemoTest {

    public static void main(String[] args) throws Exception {
        ExternalizableClass e1 = new ExternalizableClass("pravn", 10, 20);

        //Seriailization
        System.out.println("Serialization started ");
        FileOutputStream fileOutputStream = new FileOutputStream("car.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(e1);

        System.out.println(e1.getS() + " ... " + e1.getJ() + " ... " + e1.getI());

        //Deserialization
        System.out.println("Deserialization started ");
        FileInputStream fileInputStream = new FileInputStream("car.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ExternalizableClass read = (ExternalizableClass)objectInputStream.readObject();

        System.out.println(read.getS() + " ... " + read.getJ() + " ... " + read.getI());
    }
}
