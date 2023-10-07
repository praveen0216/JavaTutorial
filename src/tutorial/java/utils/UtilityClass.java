package tutorial.java.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UtilityClass {

    public static Integer[] convertPrimitiveIntArrayToObjectIntegerArray(int[] arr) {
        //int[] data = {1,2,3,4,5,6,7,8,9,10};

        // To boxed array
        Integer[] what = Arrays.stream( arr ).boxed().toArray( Integer[]::new );
        Integer[] ever = IntStream.of( arr ).boxed().toArray( Integer[]::new );

        // To boxed list
        List<Integer> you  = Arrays.stream( arr ).boxed().collect( Collectors.toList() );
        List<Integer> like = IntStream.of( arr ).boxed().collect( Collectors.toList() );

        return what;
    }

    public static void displayPrimitiveIntArray(int[] arr) {
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void displayObjectArray(Object[] arr) {
        Arrays.stream(arr).forEach(System.out::println);
    }


}
