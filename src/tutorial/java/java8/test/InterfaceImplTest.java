package tutorial.java.java8.test;

import tutorial.java.java8.base.InterfaceImpl;
import tutorial.java.java8.fi.InterfaceA;
import tutorial.java.java8.fi.InterfaceB;

public class InterfaceImplTest {

    public static void main(String[] args){
        InterfaceImpl i = new InterfaceImpl();
        i.display();

        InterfaceA iA = ()-> System.out.println("iA");
        iA.m();
        iA.display();

        InterfaceB iB = ()-> System.out.println("iB");
        iB.m();
        iB.display();


    }
}
