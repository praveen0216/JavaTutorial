package tutorial.java.java8.test;

import java.util.HashSet;
import java.util.List;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(12, 45, 89, 54, 5, 85, 348, 45, 12, 48, 274, 284, 14, 114, 117);
        System.out.println("Even number list" + getEvenNumberList(l));
        displayEventNumberList(l);
        findAllNumberStartingWithIn(4, l);
        findDuplicateNumber(l);
        findFirstElement(l);
        findTotalElementsPresent(l);
        findMaxElementPresent(l);
    }

    private static void findMaxElementPresent(List<Integer> l) {
        l.stream().max(Integer::compareTo).ifPresent(System.out::println);
    }

    private static void findTotalElementsPresent(List<Integer> l) {
        System.out.println("Display total elements count " + l.stream().count());

    }

    private static void findFirstElement(List<Integer> l) {
        System.out.println("Display first element ");
        l.stream().findFirst().ifPresent(System.out::println);
    }

    private static void findDuplicateNumber(List<Integer> l) {
        Set<Integer> set = new HashSet<>();
        System.out.println("Display duplicate numbers");
        l.stream().filter(e -> !set.add(e)).forEach(System.out::println);
    }

    private static void findAllNumberStartingWithIn(int firstDigit, List<Integer> l) {
        System.out.println("Display numbers starting with " + firstDigit);
        l.stream().map(s -> s+"").filter(s -> s.startsWith(String.valueOf(firstDigit))).forEach(System.out::println);
    }

    private static void displayEventNumberList(List<Integer> l) {
        System.out.println("Display Even number list");
        l.stream().filter(e-> e%2 ==0).forEach(System.out::println);
    }

    private static List<Integer> getEvenNumberList(List<Integer> l) {
        return l.stream().filter(e -> e %2 ==0).collect(Collectors.toList());
    }
}
