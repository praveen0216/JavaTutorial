package tutorial.java.files.runApp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("fileWriterDemo.txt", true);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        bw.write(100);
        bw.newLine();
        bw.write("100");
        bw.newLine();
        bw.write("praveenKumaSharma");
        bw.newLine();
        char [] ch = {'a','b', 'c'};
        bw.write(ch);
        bw.newLine();
        bw.flush();
        bw.close();

    }
}
