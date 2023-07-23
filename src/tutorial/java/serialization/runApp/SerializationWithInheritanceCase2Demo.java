package tutorial.java.serialization.runApp;


import tutorial.java.serialization.model.Car;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationWithInheritanceCase2Demo {

    /**
     * This code shows the behavior of Serialization w.r.t inheritance
     *
     * Case 2: When child class implements Serializable and parent class does not
     *
     *
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Car car = new Car();
        car.setI(888);
        car.setJ(999);

        //Seriailization
        System.out.println("Serialization started ");
        FileOutputStream fileOutputStream = new FileOutputStream("car.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(car);

        System.out.println(car.getI() + " ... " + car.getJ());

        //Deserialization
        System.out.println("Deserialization started ");
        FileInputStream fileInputStream = new FileInputStream("car.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Car read = (Car)objectInputStream.readObject();

        //Output
        System.out.println(read.getI() + " ... " + read.getJ());
    }
}
