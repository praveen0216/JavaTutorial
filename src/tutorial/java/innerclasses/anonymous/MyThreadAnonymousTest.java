package tutorial.java.innerclasses.anonymous;

import java.util.stream.IntStream;

public class MyThreadAnonymousTest {

    public static void main(String[] args) {

        Thread t = new Thread(() -> IntStream.range(0, 10).forEach(i -> System.out.println("Child Thread")));
        t.start();
        IntStream.range(0, 10).forEach(i -> System.out.println("Main Thread"));
    }
}
