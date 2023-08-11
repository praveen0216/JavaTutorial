package tutorial.java.innerclasses.methodlocal;

public class MethodLocalInnerClassAccessInnerClassIntance {

    public void m1() {
        int x = 10;
        //x=x+1;

        class Inner {
            public void m2() {
                System.out.println(x); // if line 7 is uncommented : Variable 'x' is accessed from within inner class, needs to be final or effectively final
            }
        }
        Inner i = new Inner();
        i.m2();
    }

    public static void main(String[] args) {
        new MethodLocalInnerClassAccessInnerClassIntance().m1();
    }
}
