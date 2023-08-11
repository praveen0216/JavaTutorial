package tutorial.java.innerclasses.methodlocal;

public class MethodLocalInnerClassTest {

    public void m() {
        class Inner {
            public void sum(int a, int b) {
                System.out.println("Sum of " + a + " and " + b + " = " + (a+b));
            }
        }
        Inner i = new Inner();
        i.sum(10, 20);
        i.sum(100, 200);
        i.sum(1000, 2000);
        i.sum(20, 30);
        i.sum(200, 300);
    }

    public static void main(String[] args) {
        MethodLocalInnerClassTest obj = new MethodLocalInnerClassTest();
        obj.m();
    }
}
