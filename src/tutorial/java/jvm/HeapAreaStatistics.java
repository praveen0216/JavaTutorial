package tutorial.java.jvm;

import java.io.IOException;

public class HeapAreaStatistics {

    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println("max memory : " + r.maxMemory());
        System.out.println("Initial memory : " + r.totalMemory());
        System.out.println("free memory : " + r.freeMemory());
        System.out.println("consmed memory  : " + (r.totalMemory()-r.freeMemory()));
        System.out.println("availabe processor : " + r.availableProcessors());
    }
}
