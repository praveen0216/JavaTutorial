package tutorial.java.regularexpression;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantifiersRegrexTest {

    private static final String  SMALL_A = "a";
    private static final String  SMALL_A_PLUS = "a+";
    private static final String  SMALL_A_ASTERISK = "a*";
    private static final String  SMALL_A_QUESTION = "a?";

    private static final String  TARGET_STRING = "abaabaaab";

    public static void main(String[] args) {

        List<String> regrexList = Arrays.asList(SMALL_A, SMALL_A_PLUS, SMALL_A_ASTERISK, SMALL_A_QUESTION) ;

        regrexList.forEach(QuantifiersRegrexTest::compilePattern);
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

