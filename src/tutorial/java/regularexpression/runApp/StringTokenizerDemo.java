package tutorial.java.regularexpression.runApp;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

    public static void main(String[] args) {
        //Example 1 :  default regular expression space
        StringTokenizer st = new StringTokenizer("Praveen Kumar Sharma");
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        //Example 2
        StringTokenizer st1 = new StringTokenizer("19-09-2014", "-");
        while(st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }
    }
}
