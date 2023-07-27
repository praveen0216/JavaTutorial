package tutorial.java.regularexpression;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClassRegrexTest {

    private static final String  EITHER_a_b_c = "[abc]";
    private static final String  EXCEPT_a_b_c = "[^abc]";
    private static final String  LOWERCASE_ALPHABET = "[a-z]";
    private static final String  UPPERCASE_ALPHABET = "[A-Z]";
    private static final String  ALL_ALPHABET = "[a-zA-Z]";
    private static final String  DIGIT = "[0-9]";
    private static final String  ALPHANUMERIC = "[0-9a-zA-Z]";
    private static final String  SPECIAL_CHARACTER = "[^0-9a-zA-Z]";

    private static final String  TARGET_STRING = "a3b#K@9Z";

    public static void main(String[] args) {

        List<String> regrexList = Arrays.asList(EITHER_a_b_c, EXCEPT_a_b_c, LOWERCASE_ALPHABET, UPPERCASE_ALPHABET,
                ALL_ALPHABET, DIGIT, ALPHANUMERIC, SPECIAL_CHARACTER ) ;

        regrexList.forEach(CharacterClassRegrexTest::compilePattern);
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

