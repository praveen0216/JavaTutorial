package tutorial.java.oops.overriding;

class Parent1 {
    public final void m() {
        System.out.println("Parent1");
    }
}

class Children1 extends Parent1 {
    /**
     * 'm()' cannot override 'm()' in 'tutorial.java.oops.overriding.Parent1'; overridden method is final
     *
     */
    /*public void m() {
        System.out.println("Parent1");
    }*/
}
public class RestrictOverridingDemo {
}
