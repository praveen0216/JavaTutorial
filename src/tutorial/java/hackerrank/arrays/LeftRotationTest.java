package tutorial.java.hackerrank.arrays;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class LeftRotationTest {


    public static void main(String[] args) {

         rotateLeft(4, IntStream.range(1, 6).boxed().collect(toList())).forEach(System.out::println);

    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Using recursion
        int len  =  arr.size();
        int temp = 0;
        if (d == 0) return arr;
        else {
            temp = arr.get(0);
            for (int i = 0; i < len && i+1 < len; i ++ ) {
                arr.set(i, arr.get(i+1));
            }
            arr.set(len-1, temp);
            return rotateLeft(--d,  arr);
        }
    }
}
