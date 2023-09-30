package tutorial.java.oops.overloading;

class Animal {

}

class Monkey extends Animal {

}

public class ObjectOverloadingDemo {

    public void m(Animal a) {
        System.out.println("Animal");
    }

    public void m(Monkey m) {
        System.out.println("Monkey");
    }

    public static void main(String[] args) {
        ObjectOverloadingDemo t = new ObjectOverloadingDemo();
        Animal a1 = new Animal(); //Animal
        /**
         *  Compiler will do method resolution based on Refrence type not based on Runtime object
         */
        Animal a2 =  new Monkey(); //Animal
        Monkey m1 = new Monkey();//Monkey

        t.m(a1);
        t.m(a2);
        t.m(m1);

        /**
         * Not possible
         */
        //Monkey m2 = new Animal();
    }
}
