package tutorial.java.gc;

public class FinalizeMethodCallsOnlyOnceTest {

    static FinalizeMethodCallsOnlyOnceTest s;

    public static void main(String[] args) throws InterruptedException {
        FinalizeMethodCallsOnlyOnceTest f = new FinalizeMethodCallsOnlyOnceTest();
        System.out.println(f.hashCode());
        f = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(s.hashCode());
        s = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println("End of main");
    }

    public void finalize() {
        System.out.println("finalize method called");
        s = this;
    }
}
