package tutorial.java.oops.overriding;

class P1 {
    //case: 1  static to non-static
    public static void m1() {
    }

    //case: 2 non-static to static
    public void m2() {
    }

    //case : 3 static to static .
    public static void m3() {
    }
}

class C1 extends P1 {

    //case: 1  static to non-static
    /**
     * CE:
     * Instance method 'm1()' in 'tutorial.java.oops.overriding.C1'
     * cannot override static method 'm1()' in 'tutorial.java.oops.overriding.P1'
     *
     */
    /*public void m1() {
    }*/


    //case: 2 non-static to static
    /**
     * CE:
     * Static method 'm2()' in 'tutorial.java.oops.overriding.C1'
     * cannot override instance method 'm2()' in 'tutorial.java.oops.overriding.P1'
     *
     *
     */
    /*public static void m2() {
    }*/

    //case : 3 static to static .

    /**
     * This is valid but not overriding . It is called method hiding
     *
     */
    public static void m3() {
    }
}
public class StaticMethodOverrideDemo {
}
