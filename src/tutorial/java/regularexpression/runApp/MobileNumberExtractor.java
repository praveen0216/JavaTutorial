package tutorial.java.regularexpression.runApp;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberExtractor {

    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter("src/resource/output.txt");
        Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");

        BufferedReader br = new BufferedReader(new FileReader("src/resource/input.txt"));
        String line = br.readLine();
        while (line != null) {
            Matcher m = p.matcher(line);
            while (m.find()) {
                pw.println(m.group());
            }
            line = br.readLine();
        }
        pw.flush();
    }
}
