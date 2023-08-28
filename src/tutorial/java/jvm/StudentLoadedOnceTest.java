package tutorial.java.jvm;

public class StudentLoadedOnceTest {

    public static void main(String[] args) throws ClassNotFoundException {

        Student s1 = new Student();
        Class c1 = s1.getClass();

        Student s2 = new Student();
        Class c2 = s2.getClass();

        System.out.println("c1 hashcode " + c1.hashCode());
        System.out.println("c2 hashcode " + c2.hashCode());
        System.out.println("c1 == c2 ?  " + (c1 == c2));
    }
}
