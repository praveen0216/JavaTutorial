package tutorial.java.java8.fi;

@FunctionalInterface
public interface InterfaceB {
    public void m();

    default void display() {
        System.out.println("display method of InterfaceB");
    }
}
