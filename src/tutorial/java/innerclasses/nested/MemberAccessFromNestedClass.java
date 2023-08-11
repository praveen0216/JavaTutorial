package tutorial.java.innerclasses.nested;

public class MemberAccessFromNestedClass {

    int x = 10;
    static int y = 20;

        static class Nested {

            public void m1() {
                // System.out.println(x); //CE: Non-static field 'x' cannot be referenced from a static context
                System.out.println(y);
            }

            public static void m2() {
                System.out.println(y);
                //System.out.println(x); //CE : Non-static field 'x' cannot be referenced from a static context
            }
        }
}
