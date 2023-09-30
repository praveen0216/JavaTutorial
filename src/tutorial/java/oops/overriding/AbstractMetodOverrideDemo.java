package tutorial.java.oops.overriding;

abstract class Parent2 {
    public abstract void m();

    public void m1() {
        System.out.println("hello");
    }
}

abstract class Children2 extends Parent2 {

    /**
     * child class must override the parent class abstract method
     *
     * Abstract to non-abstract
     *
     */
    @Override
    public void m() {

    }

    /**
     *
     *
     * non-abstract to abstract
     *
     */
    public abstract void m1();
}
public class AbstractMetodOverrideDemo {
}
