package tutorial.java.serialization.runApp;

import tutorial.java.serialization.model.Cat;
import tutorial.java.serialization.model.Dog;
import tutorial.java.serialization.model.Lion;

import java.io.*;

public class MultipeObjectDeserialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Serialization
        FileOutputStream fos = new FileOutputStream("mul.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Dog());
        oos.writeObject(new Cat());
        oos.writeObject(new Lion());
        //Deserialization in order

        FileInputStream fis = new FileInputStream("mul.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog dog = (Dog)ois.readObject();
        Cat cat = (Cat)ois.readObject();
        Lion lion = (Lion)ois.readObject();

        System.out.println(dog.i);
        System.out.println(dog.j );

        System.out.println(cat.c);
        System.out.println(cat.d);

        System.out.println(lion.l);
        System.out.println(lion.m );

    }
}
