package tutorial.java.gc;

public class FinalizeTest {

    public static void main(String[] args) {

        /**
         *
         * if we replace line A with this :  String obj = new String("praveen");
         * Then finalize method of String class will be called and we won't get this message "finalize method call"
         *
         */

        FinalizeTest obj = new FinalizeTest(); //line A
        obj = null ;
        Runtime.getRuntime().gc();  // creates a dameon thread so 2 threads
        System.out.println("End of main");

    }

    public void finalize() {
        System.out.println("finalize method call");
    }
}
