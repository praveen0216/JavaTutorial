package tutorial.java.oops.overloading;

public class OverloadingDemo {

    /**
     *
     * Automatic argument promotion in overloading
     *
     *   byte -> short ->
     *                      int -> long -> float -> double
     *            char ->
     *
     *
     *  Preferences
     *   Rule 1: between Parent and child argument -> Child
     *   Rule 2: Same hierarchy  -> ambiguity
     *   Rule 3: Exact argument match is preferred
     *   Rule 4: var-arg vs normal arg  -> preference to normal arg
     *
      */
    OverloadingDemo() {

    }
    public void m(int i) {
        System.out.println("int-arg");
    }

    public void m(float i) {
        System.out.println("float-arg");
    }

    public void m(String i) {
        System.out.println("string-arg");
    }

    public void m(StringBuffer i) {
        System.out.println("stringbuffer-arg");
    }

    public void m(Object i) {
        System.out.println("object-arg");
    }

    public void m(int i, float f) {
        System.out.println("int-float-arg");
    }

    public void m(float f, int i) {
        System.out.println("float-int-arg");
    }

    public void m1(String s) {
        System.out.println("string-arg");
    }

    /**
     * It can take zero to any number of arguments of type String
     *  It gets least priority
     */
    public void m1(String... s) {
        System.out.println("var-arg");
    }

    public static void main(String[] args) {
        OverloadingDemo obj = new OverloadingDemo();
        obj.m(10);
        obj.m(10.5f);
        obj.m('a');
        obj.m(10l);
        obj.m("A");
        obj.m(new Object());
        obj.m(new StringBuffer("A"));
        /**
         * if we remove m(StringBuffer i)
         * O/P
         * string-arg
         *
         * Reason : Object and string argument will be available.
         * String is child of Object and child get preference in automatic promotion
         *
         *
         * If we don't remove then
         * CE: as String and StringBuffer are of same level and both are child of Object class
         */
        //obj.m(null);
        obj.m(10, 10.5f);
        obj.m(10.5f, 10);
        /**
         * Ambiguous method call. Both
         * m(int,float)in OverloadingDemo and
         * m(float,int) in OverloadingDemo match
         *
         *
         */
        //obj.m(10, 10);

        /**
         *
         * Compile Time Exception
         * Cannot resolve method 'm(float, float)'
         *
         */
        //obj.m(10.5f, 10.5f);

        obj.m1("S");
        obj.m1();
        obj.m1("S", "T", "O", "P");
    }
}
