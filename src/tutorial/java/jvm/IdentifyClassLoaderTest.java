package tutorial.java.jvm;

public class IdentifyClassLoaderTest {

    public static void main(String[] args) {

        /**
         * Bootstrap class loader is not java object hence null
         *
         * String  class is in java.lang package which is in bootstrap classpath
         */
        System.out.println(String.class.getClassLoader());
        System.out.println(StaticBlockTest.class.getClassLoader());
        System.out.println(Student.class.getClassLoader());
    }
}
