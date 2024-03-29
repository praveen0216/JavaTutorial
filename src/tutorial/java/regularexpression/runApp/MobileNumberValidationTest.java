package tutorial.java.regularexpression.runApp;

import java.util.Arrays;

public class MobileNumberValidationTest {

    public static void main(String[] args) {
        Arrays.asList("7456789067", "1234567890", "2345678901", "9876543210", "12345",
                        "07456789067", "917456789067")
                .forEach(MobileNumberValidationTest::validateMobileNumber);

    }

    private static void validateMobileNumber(String mobileNumber) {
        if (mobileNumber == null || mobileNumber.length() < 10)  {
            System.out.println("Invalid number" + mobileNumber);
            return;
        }

        //To check 10 digit mobile number
       System.out.println( "mobileNumber : " + mobileNumber + " isValid : " +
               mobileNumber.matches("[7-9][0-9]{9}"));
        //To check 11 or 12 digit mobile number
        System.out.println( "mobileNumber : " + mobileNumber + " isValid : " +
                mobileNumber.matches("(0|91)?[7-9][0-9]{9}"));
    }
}
