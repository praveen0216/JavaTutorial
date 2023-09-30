package tutorial.java.oops.overriding;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class Parents {

    //Case: 1
    public void m1() throws Exception {
    }

    //Case: 2
    public void m2(){
    }

    //Case: 3
    public void m3() throws Exception {
    }

    //Case: 4
    public void m4() throws IOException {
    }

    //Case: 5
    public void m5() throws IOException {
    }

    //Case: 6
    public void m6() throws IOException {
    }

    //Case: 7
    public void m7() throws IOException {
    }
}

class Childs extends Parents {

    //Case: 1
    public void m1() {
    }

    //Case: 2
    /**
     *
     * CE:  overridden method does not throw 'java.lang.Exception'
     *
     */
    /*public void m2() throws Exception{
    }*/

    //Case: 3
    public void m3() throws IOException {
    }

    //Case: 4
    /**
     * CE:
     * overridden method does not throw 'java.lang.Exception'
     * @throws Exception
     */
   /* public void m4() throws Exception {
    }*/

    //Case: 5
    public void m5() throws FileNotFoundException, EOFException {
    }

    //Case: 6
    /**
     * CE:
     * overridden method does not throw 'java.lang.InterruptedException'
     * @throws EOFException
     * @throws InterruptedException
     */
    /*public void m6() throws EOFException, InterruptedException {
    }*/

    //Case: 7

    /**
     * Valid as these are unchecked exception
     * @throws ArithmeticException
     * @throws NullPointerException
     * @throws ClassCastException
     */
    public void m7() throws ArithmeticException, NullPointerException, ClassCastException {
    }
}
public class ExceptionOverridingDemo {
}
