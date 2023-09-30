package tutorial.java.oops.overriding;

class ParentClass {
    int x1 = 888;
    static int x2 = 888;
}

class ChildClass extends ParentClass {
    int x1 = 999;
    static int x2 = 999;
}
public class OverridingWrtVariableDemo {

    public static void main(String[] args) {
        ParentClass pc1 = new ParentClass();
        ParentClass pc2 = new ChildClass();
        ChildClass c = new ChildClass();

        //case: 1
        System.out.println("Case 1 : Parent -> non-static && Child -> non-static ");
        /**
         * Parent -> non-static
         * Child -> non-static
         */
        System.out.println(pc1.x1);
        System.out.println(pc2.x1);
        System.out.println(c.x1);

        //case: 2
        System.out.println("Case 2 : Parent -> static && Child -> non-static ");
        /**
         * Parent -> static
         * Child -> non-static
         */
        System.out.println(pc1.x2);
        System.out.println(pc2.x2);
        System.out.println(c.x1);

        //case: 3
        System.out.println("Case 3 : Parent -> non-static && Child -> static ");
        /**
         * Parent -> non-static
         * Child -> static
         */
        System.out.println(pc1.x1);
        System.out.println(pc2.x1);
        System.out.println(c.x2);

        //case: 4
        System.out.println("Case 4 : Parent -> static && Child -> static ");
        /**
         * Parent -> static
         * Child -> static
         */
        System.out.println(pc1.x2);
        System.out.println(pc2.x2);
        System.out.println(c.x2);
    }
}
