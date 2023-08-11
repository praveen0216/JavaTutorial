package tutorial.java.innerclasses.nested;

public class OuterClass {

    static class Nested {
        public void m() {
            System.out.println("Inside nested inner class method ");
        }
    }

    public static void main(String[] args) {
        Nested n = new Nested();
        n.m();
    }
}
