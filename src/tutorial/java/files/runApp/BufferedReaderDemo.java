package tutorial.java.files.runApp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("fileWriterDemo.txt");
        BufferedReader br = new BufferedReader(fileReader);
        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
}
