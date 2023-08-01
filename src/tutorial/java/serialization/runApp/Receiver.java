package tutorial.java.serialization.runApp;

import tutorial.java.serialization.model.Sky;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Receiver {

    public static void main(String[] args) throws  Exception {

        FileInputStream fileInputStream = new FileInputStream("sky.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Sky sky = (Sky) objectInputStream.readObject();
    }
}
