package tutorial.java.java8.comparator;

import java.util.Comparator;

public class UserComparator {

    public static  Comparator comparatorByLastName() {
        return Comparator.comparing(User::getLastName);
    }

    public static  Comparator comparatorByFirstName() {
        return Comparator.comparing(User::getFirstName);
    }

    public static  Comparator comparatorByLastThenFirstName() {
        return Comparator.comparing(User::getLastName).thenComparing(User::getFirstName);
    }

    public static  Comparator comparatorByAge() {
        return Comparator.comparingInt(User::getAge);
    }

    public static Comparator comparatorByHeight() {
        return Comparator.comparingLong(User::getHeight);
    }

    public static Comparator comparatorBySalary() {
        return Comparator.comparingDouble(User::getSalary);
    }

    public static Comparator comparatorBySalaryThenHeightThenAge() {
        return Comparator
                .comparingDouble(User::getSalary)
                .thenComparingLong(User::getHeight)
                .thenComparingInt(User::getAge);
    }
}
