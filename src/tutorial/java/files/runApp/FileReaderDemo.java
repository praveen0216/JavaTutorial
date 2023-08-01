package tutorial.java.files.runApp;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

    public static void main(String[] args) throws IOException {

        /**
         * File Reader Character by character
         */

        FileReader fileReader = new FileReader("fileWriterDemo.txt");
        int i = fileReader.read();
        while (i != -1) {
            System.out.print((char)i);
            i = fileReader.read();
        }

        System.out.println( "\n *******************************************");

        /**
         * File Reader Character[]
         */

        File f = new File("fileWriterDemo.txt");
        char[] ch = new char[(int)f.length()];
        FileReader fileReader2 = new FileReader(f);
        fileReader2.read(ch);

        for(char ch1: ch) {
            System.out.print(ch1);
        }

        fileReader.close();
        fileReader2.close();
    }
}
