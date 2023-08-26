package tutorial.java.general;

import java.util.HashMap;
import java.util.Map;

public class MapInsertTest {

    public static void main(String[] args) {
        Student s1 = new Student("Prachi", 28);
        Student s2 = new Student("Prachi", 29);

        Map<Student, Integer> map = new HashMap<>();
        map.put(s1, s1.getAge());
        map.put(s2, s2.getAge());
        Runtime r = Runtime.getRuntime();


        map.forEach((k,v)-> System.out.println("Key : " + k.getName() + " value : " + v ));
        
    }
}
