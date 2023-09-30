package tutorial.java.oops.overriding;

class Parent3 {

    public synchronized void  m1() {
    }

    public native void m2() ;

    public strictfp void m3(){
    }

    public final void m4(){
    }

    public void m5(){
    }
}

class Children3 extends Parent3 {
    public  void  m1() {
    }

    public void m2() {
    }
    public void m3(){
    }

    /**
     * final method cannot be overriden
     * final to non-final not possible
     */
    /*public void m4(){
    }*/

    /**
     * non-final method can be overriden
     * non-final to final is possible
     */
    public final void m5(){
    }
}
public class PossibleModifierOverrridingDemo {
}
