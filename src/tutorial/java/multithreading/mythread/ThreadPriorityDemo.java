package tutorial.java.multithreading.mythread;

import java.util.stream.IntStream;

class ThreadA implements  Runnable {
     @Override
     public void run() {
         System.out.println(String.format("child Thread %s with priority %d", Thread.currentThread().getName()
                 , Thread.currentThread().getPriority()));
         IntStream.range(0,10).forEach((i)-> System.out.println("child thread"));
     }
}
public class ThreadPriorityDemo {

    public static void main(String[] args) {

        ThreadA t1 = new ThreadA();
        Thread t =  new Thread(t1);
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();

        System.out.println(String.format("main Thread %s with priority %d", Thread.currentThread().getName()
        , Thread.currentThread().getPriority()));
        IntStream.range(0,10).forEach((i)-> System.out.println("main thread"));

    }
}
