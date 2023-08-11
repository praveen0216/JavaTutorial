package tutorial.java.innerclasses.anonymous;

import java.util.stream.IntStream;

public class NormalMyThreadTest {

    public static void main(String[] args) {

        MyThread t = new MyThread();
        t.start();
        IntStream.range(0, 10).forEach(i -> System.out.println("Main Thread"));
    }
}
