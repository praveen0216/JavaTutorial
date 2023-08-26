package tutorial.java.gc;

public class FinalizeCalledAutomaticallyByJVM {

    static int count = 0 ;

    public static void main(String[] args) {
        for(int i = 0 ; i < 1000000; i ++) {
            FinalizeCalledAutomaticallyByJVM t =  new FinalizeCalledAutomaticallyByJVM();
            t = null;
        }
    }

    public void finalize() {
        System.out.println("Finalize method called " + ++count);
    }
}
