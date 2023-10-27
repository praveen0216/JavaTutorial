package tutorial.java.java8.comparator;

import java.util.Objects;

public class User {
    private String firstName;
    private String lastName;
    private int age;

    private long height ;

    private double salary;

    public User() {
    }

    public User(String firstName, String lastName, int age, long height, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.salary = salary;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                height == user.height &&
                Double.compare(user.salary, salary) == 0 &&
                firstName.equals(user.firstName) &&
                lastName.equals(user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, height, salary);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", salary=" + salary +
                '}';
    }
}
