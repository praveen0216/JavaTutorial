package tutorial.java.gc;

public class FinalizeInvokeTest {

    public static void main(String[] args) throws Throwable {

        FinalizeInvokeTest t = new FinalizeInvokeTest();
        t.finalize();
        t.finalize();
        t = null ;
        System.gc();
        System.out.println("End of main");
        Thread.sleep(1000);

    }

    public void finalize() {
        System.out.println("finalize method call");
    }
}
