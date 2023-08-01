package tutorial.java.files.runApp;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {
        File f = new File("archieve");
        /*if(f.exists()) {
            f.delete();
        }*/

        //we can use both to delete
        f.deleteOnExit();
    }
}
