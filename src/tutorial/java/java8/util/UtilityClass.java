package tutorial.java.java8.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class UtilityClass {

    private UtilityClass() {
        throw new IllegalArgumentException("Utility class ");
    }

    public static <A> List<A> cloneWithoutNulls1(final List<A> list) {
        List<A> out = new ArrayList<>(list);
        while(out.remove(null)) {}
        return out;
    }


    public static <A> List<A> cloneWithoutNulls2(final List<A> list) {
        list.removeIf(l -> l==null);
        list.removeIf(Predicate.isEqual(null));
        return list;

    }


}
