package tutorial.test;

public class SingletonClass {

    private static SingletonClass object = new SingletonClass();

    public SingletonClass get() {
        return object;
    }

    public  SingletonClass() {
    }

}


