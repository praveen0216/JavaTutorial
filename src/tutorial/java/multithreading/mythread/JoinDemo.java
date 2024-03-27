package tutorial.java.multithreading.mythread;

import java.util.stream.IntStream;

class WeddingCardThread implements  Runnable {
    public static Thread wc = Thread.currentThread();
     @Override
     public void run() {
         wc.setName("WeddingCard");
         System.out.println(String.format("WeddingCard Thread name:  %s with priority : %d",
                 wc.getName(), wc.getPriority()));
         try {
             JoinDemo.v.join();
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
         IntStream.range(0,10).forEach((i)-> System.out.println("WeddingCard thread"));
     }
}

class WeddingCardDistributionThread implements  Runnable {
    public static Thread wcd = Thread.currentThread();
    @Override
    public void run() {
        wcd.setName("WeddingCardDistribution");

        System.out.println(String.format("WeddingCardDsistribution Thread name : %s with priority : %d", wcd.getName()
                , wcd.getPriority()));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            WeddingCardThread.wc.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        IntStream.range(0,10).forEach((i)-> System.out.println("WeddingCardDistribution thread"));
    }
}
public class JoinDemo {

    public static Thread v = Thread.currentThread();

    public static void main(String[] args) {

        v.setName("VenueFixing");

        WeddingCardThread wct = new WeddingCardThread();
        WeddingCardDistributionThread wcdt = new WeddingCardDistributionThread();
        Thread t1 =  new Thread(wct);
        Thread t2 =  new Thread(wcdt);
        t1.start();
        t2.start();


        System.out.println(String.format("main Thread %s with priority %d", v.getName(), v.getPriority()));
        IntStream.range(0,10).forEach((i)-> System.out.println("VenueFixing thread"));

    }
}
