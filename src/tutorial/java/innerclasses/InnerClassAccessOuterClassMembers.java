package tutorial.java.innerclasses;

public class InnerClassAccessOuterClassMembers {

    int x = 10;
    static int y = 20;

    public class Inner {
        public void m() {
            System.out.println("x  = " + x);
            System.out.println("y  = " + y);
        }
    }

    public static void main(String[] args) {
        new InnerClassAccessOuterClassMembers().new Inner().m();
    }
}
