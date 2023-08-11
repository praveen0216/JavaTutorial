package tutorial.java.innerclasses.nested;

public class StaticMethodInStaticNestedClass {

    static class Nested {
        public static void main(String[] args) {
            System.out.println("static nested class main method");
        }
    }

    public static void main(String[] args) {
        System.out.println("outer class main method");
    }
}
