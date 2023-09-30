package tutorial.java.oops.overriding;

class Parent4 {

    private void m1() {
        System.out.println("Parent4");
    }

    public void accessM1() {
        m1();
    }
    void m2() {
    }

    void m3() {
    }

    protected void m4() {
    }

    protected void m5() {
    }

    protected void m6() {
    }

    protected void m7() {
    }
}

class Children4 extends Parent4 {
    private void m1() {
        System.out.println("Children4");
    }

    public void accessM1() {
        m1();
    }

    /**
     * CE :
     *  attempting to assign weaker access privileges ('private'); was 'packageLocal'
     *
     */
    /*private void m2() {
    }*/

    protected void m2() {
    }
    public void m3() {
    }

    protected void m4() {
    }

    public void m5() {
    }

    /**
     *
     * CE :
     * attempting to assign weaker access privileges ('package-private'); was 'protected'
     *
     */
    /*void m6() {
    }*/

    /**
     * CE:
     * attempting to assign weaker access privileges ('private'); was 'protected'
     *
     */
    /*private void m7() {
    }*/
}
public class AccessModifierOverridingDemo {
    /**
     *
     * private < default < protected < public
     *
     *
     */

    public static void main(String[] args) {
        Parent4 p = new Parent4();
        p.accessM1();

        Children4 c = new Children4();
        c.accessM1();
    }
}
