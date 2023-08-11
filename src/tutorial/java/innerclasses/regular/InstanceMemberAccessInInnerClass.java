package tutorial.java.innerclasses.regular;

public class InstanceMemberAccessInInnerClass {

    int x = 10;

    class Inner {
        int x = 100;

        public void m() {
            int x = 1000;
            System.out.println("local variable x = " + x);

            System.out.println("Inner class Instance variable x = " + this.x);
            System.out.println("Inner class Instance variable x = " + Inner.this.x);

            System.out.println("Outer class Instance variable x from inner class = "
                    + InstanceMemberAccessInInnerClass.this.x);
        }
    }

    public static void main(String[] args) {
        new InstanceMemberAccessInInnerClass().new Inner().m();
        System.out.println("Outer class Instance variable x from main() = "
                + new InstanceMemberAccessInInnerClass().x);
    }
}
