package tutorial.java.innerclasses.anonymous;

public class AnonymousInnerClassTest {

    public static void main(String[] args) {

        Motor bus = new Motor();
        bus.type();
        Motor car = new Car();
        car.type();

        Motor bike =  new Motor() {
            @Override
            public void type() {
                System.out.println("bike");
            }
        };
        bike.type();

        Motor train =  new Motor() {
            @Override
            public void type() {
                System.out.println("train");
            }
        };
        train.type();

        System.out.println(bus.getClass().getName());
        System.out.println(car.getClass().getName());
        System.out.println(bike.getClass().getName());
        System.out.println(train.getClass().getName());

    }
}
