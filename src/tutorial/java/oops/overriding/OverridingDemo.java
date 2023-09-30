package tutorial.java.oops.overriding;

class P {
    public void property() {
        System.out.println("cash + land + gold");
    }

    public void marry() {
        System.out.println("XYZ");
    }
}

class C extends P {
    public void marry() {
        System.out.println("MNP");
    }
}


public class OverridingDemo {
    public static void main(String[] args) {
        P p = new P();
        p.marry();

        P p1 = new C();
        p1.marry();

        C c = new C();
        c.marry();

    }
}
