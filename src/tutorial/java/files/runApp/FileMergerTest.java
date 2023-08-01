package tutorial.java.files.runApp;

import java.io.*;

public class FileMergerTest {

    public static void main(String[] args) throws IOException {

        File f = new File("src//resource//file1.txt");
        if (!f.exists()) {
            System.out.print("file does not exists");
            System.exit(0);
        }

        PrintWriter pw = new PrintWriter("merger.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));

        writeToFile( br, pw);
        f = new File("src//resource//file2.txt");
        br = new BufferedReader(new FileReader(f));
        writeToFile( br, pw);

        br.close();
        pw.close();

    }

    private static void writeToFile(BufferedReader br, PrintWriter pw) throws IOException {
        String line = br.readLine();
        while(line != null) {
            pw.println(line);
            line = br.readLine();
        }
        pw.flush();
    }
}
