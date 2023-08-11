package tutorial.java.innerclasses.anonymous;

import java.util.stream.IntStream;

public class MyThread extends Thread {

    public void run() {
        IntStream.range(0, 10).forEach(i -> System.out.println("Child Thread"));
    }
}
