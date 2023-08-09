package tutorial.java.innerclasses;

public class OuterClassCase2 {

    /**
     * Accessing inner class code from instance area of outer class
     */

    class InnerClass {
        public void m1() {
            System.out.println("Inside inner method m1()");
        }
    }

    public void m2() {
        System.out.println("Inside outer method m2()");
        InnerClass i = new InnerClass();
        i.m1();
    }

    public static void main(String[] args) {

        // type 1
        OuterClassCase2 o =  new OuterClassCase2();
        o.m2();
    }
}
