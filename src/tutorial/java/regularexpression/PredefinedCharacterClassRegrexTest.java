package tutorial.java.regularexpression;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PredefinedCharacterClassRegrexTest {

    private static final String  ANY_CHARCTER = ".";

    private static final String  SPACE_CHARACTER = "\\s";

    private static final String  EXCEPT_SPACE_CHARACTER = "\\S";
    private static final String  DIGIT = "\\d";

    private static final String  EXCEPT_DIGIT = "\\D";
    private static final String  ALPHANUMERIC = "\\w";
    private static final String  SPECIAL_CHARACTER = "\\W";

    private static final String  TARGET_STRING = "a7b K@9z";

    public static void main(String[] args) {

        List<String> regrexList = Arrays.asList(ANY_CHARCTER, SPACE_CHARACTER, EXCEPT_SPACE_CHARACTER, EXCEPT_DIGIT,
                DIGIT, ALPHANUMERIC, SPECIAL_CHARACTER ) ;

        regrexList.forEach(PredefinedCharacterClassRegrexTest::compilePattern);
    }


    private static void compilePattern(String pattern) {
        System.out.println(pattern + " ->");
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(TARGET_STRING);
        while(m.find()) {
            System.out.println(" start index : " + m.start() + "..." + " matched string -> " + m.group());
        }
    }


}

