package tutorial.java.innerclasses.regular;

public class NestedInnerClass {

    class A {

        class B {

            class C {

                class D {

                    class E {

                        public void m() {
                            System.out.println("Innermost class method" );
                        }
                    }
                }
            }
        }
    }
}

class NestedInnerClassTest {

    public static void main(String[] args) {
        NestedInnerClass n = new NestedInnerClass();
        NestedInnerClass.A a = n.new A();
        NestedInnerClass.A.B b = a.new B();
        NestedInnerClass.A.B.C c = b.new C();
        NestedInnerClass.A.B.C.D d = c.new D();
        NestedInnerClass.A.B.C.D.E e = d.new E();
        e.m();
        new NestedInnerClass().new A().new B().new C().new D().new E().m();

    }
}
