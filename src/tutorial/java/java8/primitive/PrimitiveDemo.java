package tutorial.java.java8.primitive;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveDemo {

    public static void main(String[] args) {
        int i[] = {20, 10, 5, 8, 30};
        long l[] = {15L, 45L, 1L, 16L, 67L};
        double d[] = {23, 56, 73, 254, 985};

        IntStream is = IntStream.of(i);
        LongStream ls = LongStream.of(l);
        DoubleStream ds = DoubleStream.of(d);


        DoubleStream d1 = is.asDoubleStream();
        d1.forEach(System.out::println);

        DoubleStream d2 = is.mapToDouble(n-> n+1);
        d2.forEach(System.out::println);

        System.out.println("sum = " + is.sum() );
        System.out.println("sum = " + ls.sum() );
        System.out.println("sum = " + ds.sum() );

        Arrays.stream(i).forEach(System.out::println);
        Arrays.stream(l).forEach(System.out::println);
        Arrays.stream(d).forEach(System.out::println);



    }
}
