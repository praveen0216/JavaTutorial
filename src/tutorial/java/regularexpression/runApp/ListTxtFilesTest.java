package tutorial.java.regularexpression.runApp;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListTxtFilesTest {

    public static void main(String[] args) throws IOException {
        File f = new File("F:\\codebase\\JavaTutorial\\output");
        f.mkdir();
        PrintWriter pw = new PrintWriter("output\\TxtFileList.txt");
        File f1 = new File("F:\\codebase\\JavaTutorial");

        String[] list = f1.list();
        Pattern p = Pattern.compile("[0-9a-zA-Z_]+[.](txt|erp)");
        for(String str : list) {
            Matcher m = p.matcher(str);
            if(m.find()) {
                pw.println(m.group());
            }
        }
        pw.flush();


    }
}
