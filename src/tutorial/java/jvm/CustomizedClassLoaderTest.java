package tutorial.java.jvm;

public class CustomizedClassLoaderTest {

    public static void main(String[] args) throws ClassNotFoundException {
        Dog d = new Dog();
        CustomizedClassLoader c = new CustomizedClassLoader();
        c.loadClass("Dog");
        c.loadClass("Dog");
    }
}
