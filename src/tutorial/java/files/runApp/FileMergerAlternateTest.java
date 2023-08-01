package tutorial.java.files.runApp;

import java.io.*;

public class FileMergerAlternateTest {

    public static void main(String[] args) throws IOException {

        File f1 = new File("src//resource//file1.txt");
        File f2 = new File("src//resource//file2.txt");
        if (!f1.exists() || !f2.exists()) {
            System.out.print("file does not exists");
            System.exit(0);
        }

        PrintWriter pw = new PrintWriter("merger_alternate.txt");
        BufferedReader br1 = new BufferedReader(new FileReader(f1));
        BufferedReader br2 = new BufferedReader(new FileReader(f2));
        String line_f1 = br1.readLine();
        String line_f2 = br2.readLine();
        while ((line_f1 != null) || (line_f2 != null)) {
            if (line_f1 != null) {
                pw.println(line_f1);
                line_f1 = br1.readLine();
            }
            if (line_f2 != null) {
                pw.println(line_f2);
                line_f2 = br2.readLine();
            }
        }
        pw.flush();

        br1.close();
        br2.close();
        pw.close();

    }
}
