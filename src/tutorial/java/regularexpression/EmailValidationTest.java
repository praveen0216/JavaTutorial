package tutorial.java.regularexpression;

import java.util.Arrays;

public class EmailValidationTest {

    public static void main(String[] args) {
        Arrays.asList("1sjvjbvj@gmail.com", "12_@sjbvjhb.co.co.co.in", "a@hghg.in", "_123@gmail.com", ".abc@yahoo.co.in",
                        "pk.sh.02.hgh@ht.log.in", "yes@gmail.com", "123@_12.co.in")
                .forEach(EmailValidationTest::validateEmail);

    }

    private static void validateEmail(String email) {
        if (email == null )  {
            System.out.println("Invalid email" + email);
            return;
        }
        String regex = "[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
       System.out.println( "email : " + email + " isValid : " +
               email.matches(regex));
    }
}
