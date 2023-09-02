package tutorial.java.java8.base;

import tutorial.java.java8.fi.InterfaceA;
import tutorial.java.java8.fi.InterfaceB;

public class FITest {

    public static void main(String[] args) {
        InterfaceA fA = () -> System.out.println("Hello InterfaceA");
        fA.m();

        InterfaceB fB = () -> System.out.println("Hello InterfaceB");
        fB.m();

    }
}
