package tutorial.java.regularexpression;

import java.util.Arrays;

public class MobileNumberValidationTest {

    public static void main(String[] args) {
        Arrays.asList("7456789067", "1234567890", "2345678901", "9876543210", "12345")
                .forEach(MobileNumberValidationTest::validateMobileNumber);

    }

    private static void validateMobileNumber(String mobileNumber) {
        if (mobileNumber == null || mobileNumber.length() != 10)  {
            System.out.println("Invalid number" + mobileNumber);
            return;
        }
       System.out.println( "mobileNumber : " + mobileNumber + " isValid : " +
               mobileNumber.matches("[7-9][0-9]{9}"));
    }
}
