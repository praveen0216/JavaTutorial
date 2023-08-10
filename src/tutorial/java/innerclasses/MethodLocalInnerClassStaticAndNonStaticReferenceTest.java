package tutorial.java.innerclasses;

public class MethodLocalInnerClassStaticAndNonStaticReferenceTest {

    int x = 10;
    static int y = 20;

    /**
     * Add static to m() , it will show compile time error for x
     *
     * CE : Non-static field 'x' cannot be referenced from a static context
     *
     */
    public void m() {
        class InnerClass {
            public void m2() {
                System.out.println(x);
                System.out.println(y);
            }
        }
        InnerClass i = new InnerClass();
        i.m2();

    }

    public static void main(String[] args) {
        MethodLocalInnerClassStaticAndNonStaticReferenceTest obj =
                new MethodLocalInnerClassStaticAndNonStaticReferenceTest();
        obj.m();
    }
}
