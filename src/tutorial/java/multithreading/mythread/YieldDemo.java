package tutorial.java.multithreading.mythread;

import java.util.stream.IntStream;

class ThreadB implements  Runnable {
     @Override
     public void run() {
         System.out.println(String.format("child Thread %s with priority %d", Thread.currentThread().getName()
                 , Thread.currentThread().getPriority()));
         Thread.yield();
         IntStream.range(0,10).forEach((i)-> System.out.println("child thread"));
     }
}
public class YieldDemo {

    public static void main(String[] args) {

        ThreadB t1 = new ThreadB();
        Thread t =  new Thread(t1);
        t.start();


        System.out.println(String.format("main Thread %s with priority %d", Thread.currentThread().getName()
        , Thread.currentThread().getPriority()));
        IntStream.range(0,10).forEach((i)-> System.out.println("main thread"));

    }
}
