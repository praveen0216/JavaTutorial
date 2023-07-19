package tutorial.java.serialization.runApp;

import java.io.*;

class Tiger implements  Serializable {
    Deer deer = new Deer();
}

class Deer implements  Serializable {
    Grass grass = new Grass();
}

class Grass implements  Serializable {
    int j = 50;
}

public class ObjectGraphTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        //Serialization
        FileOutputStream fos = new FileOutputStream("obj_graph.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Tiger());

        //Deserialization
        FileInputStream fis = new FileInputStream("obj_graph.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Tiger tiger = (Tiger) ois.readObject();
        System.out.println(tiger.deer.grass.j);
    }

}
