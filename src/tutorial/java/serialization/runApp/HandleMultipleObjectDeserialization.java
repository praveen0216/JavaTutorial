package tutorial.java.serialization.runApp;

import tutorial.java.serialization.model.Cat;
import tutorial.java.serialization.model.Dog;
import tutorial.java.serialization.model.Lion;

import java.io.*;

public class HandleMultipleObjectDeserialization {

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
        Object obj;
        try {
            while ((obj = ois.readObject()) != null) {
                if (obj instanceof Dog) {
                    Dog dog = (Dog) obj;
                    System.out.println(dog.i);
                    System.out.println(dog.j);
                } else if (obj instanceof Lion) {
                    Lion lion = (Lion) obj;
                    System.out.println(lion.l);
                    System.out.println(lion.m);
                } else if (obj instanceof Cat) {
                    Cat cat = (Cat) obj;
                    System.out.println(cat.c);
                    System.out.println(cat.d);
                }
            }
        } catch (EOFException e) {
            System.out.println("done");
        } finally {
            oos.close();
            ois.close();
            fos.close();
            fis.close();
        }
    }
}
