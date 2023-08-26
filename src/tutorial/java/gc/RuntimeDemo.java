package tutorial.java.gc;

import java.util.Date;

public class RuntimeDemo {

    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println("total memory ->  " + r.totalMemory());
        System.out.println("free memory ->  " + r.freeMemory());

        /**
         * Recommended to use Runtime object to call garbage collectors as
         *
         * System.gc(); it internally uses Runtime object to call gc method
         *
         *  public static void gc() {
         *         Runtime.getRuntime().gc();
         *     }
         */

        for(int i = 0 ; i < 100000; i ++) {
            Date d = new Date();
            d = null;
        }
        System.out.println("total memory ->  " + r.totalMemory());
        r.gc();
        System.out.println("total memory ->  " + r.totalMemory());
    }
}
