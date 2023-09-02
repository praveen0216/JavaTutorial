package tutorial.java.jvm;

import java.io.IOException;

public class HeapAreaStatistics {

    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println("max memory : " + r.maxMemory());
        System.out.println("Initial memory : " + r.totalMemory());
        System.out.println("free memory : " + r.freeMemory());
        System.out.println("consmed memory  : " + (r.totalMemory()-r.freeMemory()));

        double d = 1024 * 1024 ;
        System.out.println("max memory in mb: " + r.maxMemory()/(d));
        System.out.println("Initial memory in mb : " + r.totalMemory()/d);
        System.out.println("free memory in mb : " + r.freeMemory()/d);
        System.out.println("consmed memory in mb : " + (r.totalMemory()-r.freeMemory())/d);

        System.out.println("availabe processor : " + r.availableProcessors());
    }
}
