package tutorial.java.oops.overriding;

class P3 {
    public void m1(int... x){
        System.out.println("Parent");
    }

    public void m2(int... x){
        System.out.println("Parent");
    }
}

class C3 extends P3 {
    public void m1(int... x){
        System.out.println("Child");
    }

    public void m2(int x){
        System.out.println("Child");
    }
}
public class VarArgOverridingDemo {
    public static void main(String[] args) {

        System.out.println("Overriding -- >");
        P3 p = new P3();
        p.m1(10);

        P3 p1 = new C3();
        p1.m1(10);

        C3 c = new C3();
        c.m1(10);

        System.out.println("Overloading -- >");

        p.m2(10);
        p1.m2(10);
        c.m2(10);
    }
}
