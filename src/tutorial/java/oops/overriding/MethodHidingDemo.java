package tutorial.java.oops.overriding;

class P2 {
    public static void m() {
        System.out.println("Parent");
    }
}
class C2 extends P2 {
    public static void m() {
        System.out.println("Child");
    }
}
public class MethodHidingDemo {

    /**
     * This is method hiding.
     * Based on reference type , the method resolution will take place by compiler
     *
     * Also called compile time polymorphism/ early binding/ static polymorphism
     *
     * If we remove static keyword from m() of both Parent and Child then
     * It will be called overriding
     * Based on runtime object  , the method resolution will take place by jvm
     *
     * @param args
     */

    public static void main(String[] args) {
        P2 p = new P2();
        p.m();

        P2 p1 = new C2();
        p1.m();

        C2 c = new C2();
        c.m();
    }
}
