package tutorial.java.java8.fi;

@FunctionalInterface
public interface InterfaceA {
    public void m();

    default void display() {
        System.out.println("display method of InterfaceA");
    }
}
