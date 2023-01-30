package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

        UserRegistration userRegistration = new UserRegistration();

        @Test
        public void givenFirstName_WhenValid_ShouldReturnsTrue() {
            boolean result = userRegistration.validFirstName("Rupali");
            Assertions.assertTrue(result);
        }

        @Test
        public void givenFirstName_WhenInValid_ShouldReturnsFalse() {
            boolean result = userRegistration.validFirstName("rupali");
            Assertions.assertFalse(result);
        }

        @Test
        public void givenLastName_WhenValid_ShouldReturnsTrue() {
            boolean result = userRegistration.validLastName("Anap");
            Assertions.assertTrue(result);
        }

        @Test
        public void givenLastName_WhenInValid_ShouldReturnsFalse() {
            boolean result = userRegistration.validLastName("anap");
            Assertions.assertFalse(result);
        }

        @Test
        public void givenEmail_WhenValid_ShouldReturnsTrue() {
            boolean result = userRegistration.validEmail("abc.xyz@bl.co.in");
            Assertions.assertTrue(result);
        }

        @Test
        public void givenEmail_WhenInValid_ShouldReturnsFalse() {
            boolean result = userRegistration.validEmail("rup10@gmail.com");
            Assertions.assertFalse(result);
        }

        @Test
        public void givenMobileNo_WhenValid_ShouldReturnsTrue() {
            boolean result = userRegistration.validMobileNumber("91 7083409631");
            Assertions.assertTrue(result);
        }

        @Test
        public void givenMobileNo_WhenInValid_ShouldReturnsFalse() {
            boolean result = userRegistration.validMobileNumber("7083409631");
            Assertions.assertFalse(result);
        }

        @Test
        public void givenPasswordRule1_WhenValid_ShouldReturnsTrue() {
            boolean result = userRegistration.validPasswordRule1("Rup@li-a");
            Assertions.assertTrue(result);
        }

        @Test
        public void givenPasswordRule1_WhenInValid_ShouldReturnsFalse() {
            boolean result = userRegistration.validPasswordRule1("rupali");
            Assertions.assertFalse(result);
        }

        @Test
        public void givenPasswordRule2_WhenValid_ShouldReturnsTrue() {
            boolean result = userRegistration.validPasswordRule2("Rup@ali-a_Anap");
            Assertions.assertTrue(result);
        }

        @Test
        public void givenPasswordRule2_WhenInValid_ShouldReturnsFalse() {
            boolean result = userRegistration.validPasswordRule2("rup-a.li");
            Assertions.assertFalse(result);
        }

        @Test
        public void givenPasswordRule3_WhenValid_ShouldReturnsTrue() {
            boolean result = userRegistration.validPasswordRule3("Rup@li356");
            Assertions.assertTrue(result);
        }

        @Test
        public void givenPasswordRule3_WhenInValid_ShouldReturnsFalse() {
            boolean result = userRegistration.validPasswordRule3("Rup@a.li");
            Assertions.assertFalse(result);
        }

        @Test
        public void givenPasswordRule4_WhenValid_ShouldReturnsTrue() {
            boolean result = userRegistration.validPasswordRule4("Rupali@20anap");
            Assertions.assertTrue(result);
        }

        @Test
        public void givenPasswordRule4_WhenInValid_ShouldReturnsFalse() {
            boolean result = userRegistration.validPasswordRule4("Rup20ali78anap");
            Assertions.assertFalse(result);
        }
}
