package tutorial.java.files.runApp;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class DisplayFilesAndDirectories {

    public static void main(String[] args) throws IOException {

        File file = new File("OnlyFiles.txt");
        File directory = new File("OnlyDirectory.txt");

        file.createNewFile();
        directory.createNewFile();

        PrintWriter onlyFiles = new PrintWriter("OnlyFiles.txt");
        PrintWriter onlyDirectory = new PrintWriter("OnlyDirectory.txt");


        /**
         * Approach 1 using file class list method
         */
        /*String[] list = file.getAbsoluteFile().getParentFile().list();

        for(String str : list) {
            File currentFile =  new File(str);
            if(currentFile.isFile()) {
                onlyFiles.println(currentFile.getName());
            }
            if(currentFile.isDirectory()) {
                onlyDirectory.println(currentFile.getName());
            }
        }*/

        /**
         * Approach 1 using file class listFiles method
         */
        File[] list = file.getAbsoluteFile().getParentFile().listFiles();
        for(File currentFile : list) {
            if(currentFile.isFile()) {
                onlyFiles.println(currentFile.getName());
            }
            if(currentFile.isDirectory()) {
                onlyDirectory.println(currentFile.getName());
            }
        }


        onlyFiles.flush();
        onlyDirectory.flush();

        file.setReadOnly();
        directory.setReadOnly();

        onlyFiles.close();
        onlyDirectory.close();
    }
}
