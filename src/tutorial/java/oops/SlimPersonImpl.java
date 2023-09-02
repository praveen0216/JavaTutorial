package tutorial.java.oops;

public class SlimPersonImpl {

    public static void main(String[] args) {
        SlimPerson s1 =  new SlimPerson("Praveen", 13, 45, 67);
        SlimPerson s2 =  new SlimPerson("Praveen", 13, 45, 67);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
    }
}
