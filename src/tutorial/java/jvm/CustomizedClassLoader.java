package tutorial.java.jvm;

public class CustomizedClassLoader extends  ClassLoader {

    public Class loadClass(String className) throws  ClassNotFoundException {
        return Dog.class;
    }

}
