package tutorial.java.oops.overriding;

class Father {

    public Object m1() {
        System.out.println("father");
        return null;
    }

    public Number m2() {
        System.out.println("father");
        return null;
    }

}

class Children extends Father {
    public String m1() {
        System.out.println("children");
        return null;
    }

    public Double m2() {
        System.out.println("children");
        return null;
    }

}
public class CoVarientReturnOverridingDemo {

    public static void main(String[] args) {
        Father f = new Father();
        Children c = new Children();
        Father f1 = new Children();

        f.m1();
        c.m1();
        f1.m1();

        f.m2();
        c.m2();
        f1.m2();
    }
}
