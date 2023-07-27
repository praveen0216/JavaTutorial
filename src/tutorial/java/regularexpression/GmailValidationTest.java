package tutorial.java.regularexpression;

import java.util.Arrays;

public class GmailValidationTest {

    public static void main(String[] args) {
        Arrays.asList("1sjvjbvj@gmail.com", "12_@sjbvjhb.co.co.co.in", "a@hghg.in", "_123@gmail.com", ".abc@yahoo.co.in",
                        "pk.sh.02.hgh@ht.log.in", "yes@gmail.com", "123@_12.co.in")
                .forEach(GmailValidationTest::validateGmail);

    }

    private static void validateGmail(String gmail) {
        if (gmail == null )  {
            System.out.println("Invalid email" + gmail);
            return;
        }
        String regex = "[a-zA-Z0-9][a-zA-Z0-9_.]*@gmail[.]com";
       System.out.println( "email : " + gmail + " isValid : " + gmail.matches(regex));
    }
}
