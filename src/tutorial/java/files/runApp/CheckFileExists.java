package tutorial.java.files.runApp;

import java.io.File;
import java.io.IOException;

public class CheckFileExists {

    public static void main(String[] args) throws IOException {
        File f = new File("pr.txt");
        System.out.println("file exists " + f.exists());

        f.createNewFile();
        System.out.println("file exists " + f.exists());
    }
}
