package tutorial.java.java8.consumer;

import java.util.function.Consumer;

public class ConsumerUtil {

    public static void printList() {
        Consumer<Iterable> printObjects = list -> {
            for (Object it : list) {
                System.out.println(it);
            }
        };
    }
}
