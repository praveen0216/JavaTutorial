package tutorial.java.serialization.runApp;

import tutorial.java.serialization.model.Sky;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Sender {

    public static void main(String[] args) throws Exception {
        Sky sky = new Sky();

        FileOutputStream fos = new FileOutputStream("sky.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(sky);
    }
}
