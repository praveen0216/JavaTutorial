package tutorial.java.java8.grouping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class Person {
    String name;
    int age;
    String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
public class GroupByDemo {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Ronit", 29, "jamshedpur"),
                new Person("Ankur", 31, "ranchi"),
                new Person("Vicky", 32, "giridih"),
                new Person("Praveen", 29, "jamshedpur"),
                new Person("Nishant", 29, "sambalpur"));

        //sublist
        personList.subList(2, 4).forEach(System.out::println);

        //group by city

    }
}
