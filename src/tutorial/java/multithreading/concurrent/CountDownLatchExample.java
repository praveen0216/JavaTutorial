package tutorial.java.multithreading.concurrent;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

    public static void main(String[] args) throws InterruptedException {
        int numTasks = 5;
        CountDownLatch countDownLatch = new CountDownLatch(numTasks);

        for(int i = 0 ; i < numTasks; i++) {
            Thread t = new Thread(() -> {
                System.out.println("hello");
                countDownLatch.countDown();
            });
            t.start();
        }
        countDownLatch.await();
        System.out.println("main");
    }
}
