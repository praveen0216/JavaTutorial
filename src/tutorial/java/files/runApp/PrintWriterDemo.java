package tutorial.java.files.runApp;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("fileWriterDemo.txt", true);
        PrintWriter out = new PrintWriter(fileWriter);
        out.write(100);
        out.println(true);
        out.println(new char[]{'a', 'b', 'c'});
        out.println(7.8);

        out.flush();
        out.close();

    }
}
