package tutorial.java.collection.arrays;

import tutorial.java.utils.UtilityClass;

import java.util.Arrays;

class Customer {
    String name;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student {
    int age;
    String name;

    Student() {
    }
    Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class HomeogenousTest {
    public static void main(String[] args) {
        Student[] s = new Student[4];
            s[0] =  new Student();
            s[1] = new Student("B", 12);
            s[2] = new Student("A", 11);
        /**
         * CE:
         * java: incompatible types: tutorial.java.collection.arrays.Customer
         * cannot be converted to tutorial.java.collection.arrays.Student
         */
       //s[2] = new Customer();
            display(s);


        Object[] o = new Object[4];
        o[0] =  new Student();
        o[1] = new Student("B", 12);
        o[2] = new Student("A", 11);
        o[3] = new Customer();

        UtilityClass.displayObjectArray(o);
     }

    private static void display(Student[] s) {
        Arrays.stream(s).forEach(System.out::println);
    }

    private static void display(Object[] s) {
//        for (Student temp: s) {
//            System.out.println(temp);
//        }
        Arrays.stream(s).forEach(System.out::println);
    }

}
