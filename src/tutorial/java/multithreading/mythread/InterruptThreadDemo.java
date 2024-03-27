package tutorial.java.multithreading.mythread;


import java.util.stream.IntStream;

public class InterruptThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            IntStream.range(0,10).forEach(i -> {
                System.out.println("I am lazy");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("I got interrupted");
                }
            });
        });
        t.start();

        Thread.sleep(3000);
        t.interrupt();
    }
}
