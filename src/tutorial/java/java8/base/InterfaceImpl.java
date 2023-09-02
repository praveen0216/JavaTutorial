package tutorial.java.java8.base;

import tutorial.java.java8.fi.InterfaceA;
import tutorial.java.java8.fi.InterfaceB;

public class InterfaceImpl implements InterfaceA, InterfaceB {

    @Override
    public void m() {
        System.out.println("Hello At InterfaceImpl");
    }

    @Override
    public void display() {
        InterfaceA.super.display();
    }


}
