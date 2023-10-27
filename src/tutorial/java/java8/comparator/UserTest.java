package tutorial.java.java8.comparator;

import java.util.Arrays;
import java.util.List;

public class UserTest {

    public static void main(String[] args) {
        List<User> userList = Arrays.asList(
                new User("Praveen", "Sharma", 21, 6l, 25000.00),
                new User("Ronit", "Sandhu", 31, 5l, 30000.00),
                new User("Ankur", "Sourav", 32, 6l, 30400.00),
                new User("Nishant", "Jaiswal", 23, 6l, 30400.00),
                new User("Prateek", "Sharma", 22, 6l, 30500.00),
                new User("Vicky", "Tiwari", 31, 6l, 60400.00),
                new User("Santosh", "Roy", 30, 6l, 70400.00)
        );

        System.out.println("<-----sort by last name in ascending order--------->");
        userList.sort(UserComparator.comparatorByLastName());
        userList.forEach(System.out::println);

        System.out.println("<-----sort by last name in descending order--------->");
        userList.sort(UserComparator.comparatorByLastName().reversed());
        userList.forEach(System.out::println);

        System.out.println("<------sort by first name in ascending order-------->");
        userList.sort(UserComparator.comparatorByFirstName());
        userList.forEach(System.out::println);

        System.out.println("<------sort by first name in descending order-------->");
        userList.sort(UserComparator.comparatorByFirstName().reversed());
        userList.forEach(System.out::println);

        System.out.println("<------sort by last name then first name in ascending order-------->");
        userList.sort(UserComparator.comparatorByLastThenFirstName());
        userList.forEach(System.out::println);

        System.out.println("<------sort by last name then first name in descending order-------->");
        userList.sort(UserComparator.comparatorByLastThenFirstName().reversed());
        userList.forEach(System.out::println);

        System.out.println("<------sort by age in ascending order-------->");
        userList.sort(UserComparator.comparatorByAge());
        userList.forEach(System.out::println);

        System.out.println("<------sort by age in descending order-------->");
        userList.sort(UserComparator.comparatorByAge().reversed());
        userList.forEach(System.out::println);

        System.out.println("<------sort by height in ascending order-------->");
        userList.sort(UserComparator.comparatorByHeight());
        userList.forEach(System.out::println);

        System.out.println("<------sort by height in descending order-------->");
        userList.sort(UserComparator.comparatorByHeight().reversed());
        userList.forEach(System.out::println);

        System.out.println("<------sort by salary in ascending order-------->");
        userList.sort(UserComparator.comparatorBySalary());
        userList.forEach(System.out::println);

        System.out.println("<------sort by salary in descending order-------->");
        userList.sort(UserComparator.comparatorBySalary().reversed());
        userList.forEach(System.out::println);

        System.out.println("<------sort by salary and then by height and then by age in ascending order-------->");
        userList.sort(UserComparator.comparatorBySalaryThenHeightThenAge());
        userList.forEach(System.out::println);

        System.out.println("<------sort by salary and then by height and then by age in descending order-------->");
        userList.sort(UserComparator.comparatorBySalaryThenHeightThenAge().reversed());
        userList.forEach(System.out::println);



    }
}
