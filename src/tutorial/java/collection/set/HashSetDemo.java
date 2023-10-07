package tutorial.java.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class HashSetDemo {

   static HashSet<String> hs = new HashSet<>();
   static   HashSet<String> lhs = new LinkedHashSet<>();

    public static void main(String[] args) {
        addOperations();
        removeOperations();
    }


    public static void removeOperations() {

        hs.forEach(System.out::println);
        System.out.println();
        lhs.forEach(System.out::println);
    }
    public static void addOperations() {

        List<String> list1 = List.of("X", "Y","Z", "A", "B","C");
        List<String> list2 = List.of("M", "Y","Z", "N", "B","P");

        //In HashSet , insertion order is not guaranteed
        hs.add("A");
        hs.addAll(list1);
        hs.addAll(list2);

        //In LinkedHashSet, insertion order is guaranteed
        lhs.add("A");
        lhs.add("B");
        lhs.add("C");
        lhs.add("A");
        lhs.addAll(list1);
        lhs.addAll(list2);

        hs.forEach(System.out::println);
        System.out.println();
        lhs.forEach(System.out::println);
    }
}
