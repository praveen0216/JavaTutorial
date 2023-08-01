package tutorial.java.files.runApp;

import java.io.File;
import java.io.IOException;

public class CheckDirestoryExists {

    public static void main(String[] args) throws IOException {
        File f = new File("trash");
        System.out.println("Directory exists " + f.exists());

        f.mkdir();
        System.out.println("Directory exists " + f.exists());
    }
}
