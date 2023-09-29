package tutorial.java.oops;

public class ParentChildTest {

    public static void main(String[] args) {

        /**
         * Child class reference holding child class object,  can call Parent class method and child class method
         */
        Child c = new Child();
        c.parentMethod();
        c.childMethod();

        /**
         * Parent class reference holding parent class object, can call Parent class method only
         */
        Parent p = new Parent();
        p.parentMethod();

        /**
         * Compile time Exception
         * java: cannot find symbol
         *   symbol:   method m2()
         *   location: variable p of type tutorial.java.oops.Parent
         */
        //p.m2();

        /**
         * Parent class reference holding child class object, can call Parent class method only
         */

        Parent p2 = new Child();
        p2.parentMethod();


        /**
         * Child class reference holding parent class object not possible
         *
         * java: incompatible types: tutorial.java.oops.Parent cannot be converted to tutorial.java.oops.Child
         */

        //Child c2 = new Parent();

    }
}
