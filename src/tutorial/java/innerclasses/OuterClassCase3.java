package tutorial.java.innerclasses;

public class OuterClassCase3 {

    /**
     * Accessing inner class code from outside of Outer class
     *
     */

    class InnerClass {
         public void m() {
             System.out.println("Inside inner class method m()");
         }
    }
}

class Test {
    public static void main(String[] args) {
        OuterClassCase3 o = new OuterClassCase3();
        OuterClassCase3.InnerClass i = o.new InnerClass();
        i.m();
    }
}