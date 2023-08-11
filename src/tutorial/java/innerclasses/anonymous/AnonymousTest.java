package tutorial.java.innerclasses.anonymous;

import java.util.stream.IntStream;

public class AnonymousTest {

    public static void main(String[] args) {

       new Thread(() -> IntStream.range(0, 10).forEach(i -> System.out.println("Child Thread"))).start();
       IntStream.range(0, 10).forEach(i -> System.out.println("Main Thread"));
    }
}
