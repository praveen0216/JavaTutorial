package tutorial.java.java8.fi;

@FunctionalInterface
public interface InterfaceB {
    int x =10;
    public void m();

    default void display() {
        System.out.println("display method of InterfaceB");
    }
}
