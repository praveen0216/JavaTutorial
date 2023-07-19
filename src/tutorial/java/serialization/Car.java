package tutorial.java.serialization;

import tutorial.java.serialization.model.Vechicle;

import java.io.Serializable;

public class Car extends Vechicle implements Serializable {

    int j = 20;
    public Car() {
        super();
        System.out.println("Car class constructor called");
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}
