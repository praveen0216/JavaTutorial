package tutorial.java.oops;

public class SameMethodSignature {

    public static void m() {
       System.out.println( Math.abs(-10.89) );  //abs() consider value without sign
    }

    /**
     * m()' is already defined in 'tutorial.java.oops.SameMethodSignature'
     *
     * @return
     */
   /* public int m() {
        return 10;
    }*/
    public static void main(String[] args) {
        SameMethodSignature.m();
    }
}
