package tutorial.java.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegrexTest {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("ab");
        Matcher matcher = pattern.matcher("ababbbabbabbbabbababbababababbb");
        int c = 0;
        while (matcher.find()) {
            System.out.println(matcher.start() + "..." + (matcher.end()-1) + "..." + matcher.group());
            ++c;
        }
        System.out.println("count :" + c);
    }
}
