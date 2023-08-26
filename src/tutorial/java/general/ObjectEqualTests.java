package tutorial.java.general;

public class ObjectEqualTests {

    public static void main(String[] args) {

        Student s1 = new Student("Praveen", 28);
        Student s2 = new Student("Prachi", 28);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println("hashcode s1 : " + s1.hashCode());
        System.out.println("hashcode s2 : " + s2.hashCode());
    }
}
