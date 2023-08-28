package tutorial.java.jvm;

import java.lang.reflect.Method;

public class StudentTest {

    public static void main(String[] args) throws ClassNotFoundException {
        Class s = Class.forName("tutorial.java.jvm.Student");
        int c = 0 ;
        Method[] methods = s.getDeclaredMethods();
        for(Method method : methods) {
            c++;
            System.out.println(method);
        }
        System.out.println("number of methods = " + c);
    }
}
