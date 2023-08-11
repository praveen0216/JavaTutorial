package tutorial.java.innerclasses.anonymous;

import java.util.stream.IntStream;

public class NormalMyRunnableTest {

    public static void main(String[] args) {

        Runnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
        IntStream.range(0, 10).forEach(i -> System.out.println("Main Thread"));
    }
}
