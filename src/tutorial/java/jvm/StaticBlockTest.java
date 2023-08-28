package tutorial.java.jvm;

public class StaticBlockTest {

    static {
        System.out.println("In static block");
        int a = 10;
        int b = 20;
        System.out.println("sum = " + (a + b));
    }

    public static void main(String[] args) {

    }
}
