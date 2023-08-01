package tutorial.java.regularexpression.runApp;


import java.util.regex.Pattern;

public class PatternSplitMethodDemo {

    private static final String  TARGET_STRING = "Praveen Kumar Sharma";
    private static final String  TARGET_WEBSITE = "www.praveenk.com";

    public static void main(String[] args) {

        Pattern p =  Pattern.compile("\\s") ;
        String[] split = p.split(TARGET_STRING);
        for (String str : split) {
            System.out.println(str);
        }

        Pattern dot =  Pattern.compile("[.]") ; // [.] or \\.
        String[] dots = dot.split(TARGET_WEBSITE);
        for (String str : dots) {
            System.out.println(str);
        }
    }
}
