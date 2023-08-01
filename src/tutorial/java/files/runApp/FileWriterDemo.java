package tutorial.java.files.runApp;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("fileWriterDemo.txt", true);
        fileWriter.write(100);
        fileWriter.write("\n100");
        fileWriter.write("\npraveen\nKumar\nSharma");
        fileWriter.write("\n");
        char [] ch = {'a','b', 'c'};
        fileWriter.write(ch);
        fileWriter.write("\n");
        fileWriter.flush();
        fileWriter.close();

    }
}
