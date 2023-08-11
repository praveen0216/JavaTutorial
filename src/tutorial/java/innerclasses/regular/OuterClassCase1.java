package tutorial.java.innerclasses.regular;

public class OuterClassCase1 {

    /**
     * Accessing inner class code from static area of outer class
     */

    class InnerClass {
        public void m() {
            System.out.println("Inside inner method m()");
        }
    }

    public static void main(String[] args) {

        // type 1
        OuterClassCase1 o =  new OuterClassCase1();
        OuterClassCase1.InnerClass i1 = o.new InnerClass();
        i1.m();

        // type 2
        OuterClassCase1.InnerClass i2 = new OuterClassCase1().new InnerClass();
        i2.m();

        // type 3
        new OuterClassCase1().new InnerClass().m();

    }
}
