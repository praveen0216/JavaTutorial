package tutorial.java.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidationWithMatcherClassTest {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Matcher m = p.matcher(args[0]) ;
         if (m.find() && m.group().equals(args[0])) {
             System.out.println("valid mobile number " + args[0]);
         } else {
             System.out.println("Invalid mobile number " + args[0]);
         }
    }
}
