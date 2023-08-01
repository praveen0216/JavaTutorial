package tutorial.java.files.runApp;

import java.io.*;

public class DuplicateEleminatorTest {

    public static void main(String[] args) throws IOException {
        File f = new File("src//resource//uniqueId.txt");

        BufferedReader br = new BufferedReader(new FileReader("src//resource//duplicateId.txt"));
        String line1 = br.readLine();
        PrintWriter out = new PrintWriter(f);

        while(line1 != null) {
            Boolean flag = false;
            BufferedReader file2 = new BufferedReader(new FileReader(f));
            String line2 = file2.readLine();
            while (line2 != null) {
                if (line2.equals(line1)) {
                    file2.close();
                    flag = true;
                    break;
                }
                line2 = file2.readLine();
            }
            file2.close();
            if (!flag) {
                out.println(line1);
                out.flush();
            }
            line1 = br.readLine();
        }
        br.close();
        out.close();


    }
}
