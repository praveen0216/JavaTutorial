package tutorial.java.files.runApp;

import java.io.File;

public class FileSizeDemo {

    public static void main(String[] args) {

        File f = new File("dummy2.erp");
        File f2 = new File("dummy3.txt");
        if(f.exists()) {
            System.out.println("File Size : " + f.length() + " path : " + f.getAbsolutePath()
                    + " File name : " + f.getName() + "  rename to " + f.renameTo(f2));
        }
    }
}
