package tutorial.java.collection.list;

import java.util.ArrayList;
import java.util.List;

public class RetainAllDemo {

    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>();
        l1.add("A");
        l1.add("B");
        l1.add("C");
        l1.add("D");
        l1.add("E");
        System.out.println("Main list" + l1);

        List<String> l2 = new ArrayList<>();
        l2.add("A");
        l2.add("B");
        l2.add("C");
        System.out.println("List to keep" + l2);

        l1.retainAll(l2);
        l1.forEach(System.out::println);

    }
}
