package tutorial.java.serialization.model;

public class Vechicle {

    int i = 10;
    public Vechicle() {
        System.out.println("Vechicle class constructor called");
    }

    /* public Vechicle(int i) {
        System.out.println("Vechicle class parameterised constructor called");
    }*/

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
