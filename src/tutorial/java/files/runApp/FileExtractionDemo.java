package tutorial.java.files.runApp;

import java.io.*;

public class FileExtractionDemo {

    public static void main(String[] args) throws IOException {

        BufferedReader rollNumFile = new BufferedReader(new FileReader("src//resource//rollNum.txt"));

        PrintWriter out = new PrintWriter("freshRollNum.txt");

        String line1_rollNum = rollNumFile.readLine();


        while (line1_rollNum != null ) {
            BufferedReader deleteRollNumFile = new BufferedReader(new FileReader("src//resource//deleteRollNum.txt"));
            String line1_deleteRollNum = deleteRollNumFile.readLine();
            Boolean exists = false;
            while (line1_deleteRollNum != null) {
                if (line1_deleteRollNum.equals(line1_rollNum)) {
                    deleteRollNumFile.close();
                    exists = true;
                    break;
                }
                line1_deleteRollNum =  deleteRollNumFile.readLine();
            }
            if(!exists) {
                out.println(line1_rollNum);
            }
            line1_rollNum = rollNumFile.readLine();
        }

        out.flush();

        rollNumFile.close();
        out.close();

    }
}
