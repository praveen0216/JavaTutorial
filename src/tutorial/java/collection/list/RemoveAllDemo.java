package tutorial.java.collection.list;

import java.util.*;

public class RemoveAllDemo {

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
        System.out.println("List to remove" + l2);

        l1.removeAll(l2);
        System.out.println(l1.toArray());
        l1.forEach(System.out::println);

    }
}
