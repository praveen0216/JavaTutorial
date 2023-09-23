package tutorial.java.interview.base;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class LeftZeroShifting {

    /**
     *  input - {2,0,5,0,3,9,0,1,2}
     *  Output - {0,0,0,2,5,3,9,1,2}
     *
     *
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[]  input = {2,0,5,0,3,9,0,1,2};
        LeftZeroShifting.leftShift(input);

    }
    public static void leftShift(int[] arr) {
        List<Integer> list = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());
        Predicate<Integer> zeroSearch = i -> i == 0;
        long zeroCount = list.stream().filter(zeroSearch).count();
        int j =0;
        list.removeIf(zeroSearch);
        while(j < zeroCount) {
            list.add(j, 0);
            j++;
        }
        System.out.print(list);
    }
}
