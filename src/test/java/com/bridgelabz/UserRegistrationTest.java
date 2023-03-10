package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

        UserRegistration userRegistration = new UserRegistration();

        @Test
        public void givenFirstName_WhenValid_ShouldReturnsTrue() {
            try {
                Assertions.assertTrue(userRegistration.validFirstName("Rupali"));
                System.out.println("First name is valid");
            } catch (InvalidFirstNameException e) {
                System.out.println("Invalid First Name because :- " + e);
            }
        }

        @Test
        public void givenFirstName_WhenInValid_ShouldReturnsFalse() {
            try {
                Assertions.assertTrue(userRegistration.validFirstName("rupali"));
                System.out.println("First name is valid");
            }catch (InvalidFirstNameException e) {
                System.out.println("Invalid First Name because :- " + e);
            }
        }

        @Test
        public void givenLastName_WhenValid_ShouldReturnsTrue() {
            try {
                Assertions.assertTrue(userRegistration.validLastName("Anap"));
                System.out.println("Last name is valid");
            }catch (InvalidLastNameException e) {
                System.out.println("Invalid Last Name because :- " + e);
            }
        }

        @Test
        public void givenLastName_WhenInValid_ShouldReturnsFalse() {
            try {
                Assertions.assertTrue(userRegistration.validLastName("anap"));
                System.out.println("Last name is valid");
            }catch (InvalidLastNameException e) {
                System.out.println("Invalid Last Name because :- " + e);
            }
        }

        @Test
        public void givenEmail_WhenValid_ShouldReturnsTrue() {
            try {
                Assertions.assertTrue(userRegistration.validEmail("abc.xyz@bl.co.in"));
                System.out.println("Email is valid");
            }catch (InvalidEmailException e) {
                System.out.println("Invalid Email because :- " + e);
            }
        }



        @Test
        public void givenEmail_WhenInValid_ShouldReturnsFalse() {
            try {
                Assertions.assertTrue(userRegistration.validEmail("anaprupali10@gmail.com"));
                System.out.println("Email is valid");
            }catch (InvalidEmailException e) {
                System.out.println("Invalid Email because :- " + e);
            }
        }

        @Test
        public void givenMobileNo_WhenValid_ShouldReturnsTrue() {
            try {
                Assertions.assertTrue(userRegistration.validMobileNumber("91 7083409631"));
                System.out.println("Mobile Number is valid");
            }catch (InvalidMobileNumberException e) {
                System.out.println("Invalid Mobile Number because :- " + e);
            }
        }

        @Test
        public void givenMobileNo_WhenInValid_ShouldReturnsFalse() {
            try {
                Assertions.assertTrue(userRegistration.validMobileNumber("7083409631"));
                System.out.println("Mobile Number is valid");
            }catch (InvalidMobileNumberException e) {
                System.out.println("Invalid Mobile Number because :- " + e);
            }
        }

        @Test
        public void givenPasswordRule1_WhenValid_ShouldReturnsTrue() {
            try {
                Assertions.assertTrue(userRegistration.validPasswordRule1("A@n-ap"));
                System.out.println("Password Rule1 is valid");
            }catch (InvalidPasswordRule1Exception e) {
                System.out.println("Invalid Password Rule1 because :- " + e);
            }
        }

        @Test
        public void givenPasswordRule1_WhenInValid_ShouldReturnsFalse() {
            try {
                Assertions.assertTrue(userRegistration.validPasswordRule1("anap"));
                System.out.println("Password Rule1 is valid");
            }catch (InvalidPasswordRule1Exception e) {
                System.out.println("Invalid Password Rule1 because :- " + e);
            }
        }
        @Test
        public void givenPasswordRule2_WhenValid_ShouldReturnsTrue() {
            try {
                Assertions.assertTrue(userRegistration.validPasswordRule2("Ru@a-li_Anap"));
                System.out.println("Password Rule2 is valid");
            }catch (InvalidPasswordRule2Exception e) {
                System.out.println("Invalid Password Rule2 because :- " + e);
            }
        }

        @Test
        public void givenPasswordRule2_WhenInValid_ShouldReturnsFalse() {
            try {
                Assertions.assertTrue(userRegistration.validPasswordRule2("an-ap.rup"));
                System.out.println("Password Rule2 is valid");
            }catch (InvalidPasswordRule2Exception e) {
                System.out.println("Invalid Password Rule2 because :- " + e);
            }
        }

        @Test
        public void givenPasswordRule3_WhenValid_ShouldReturnsTrue()  {
            try {
                Assertions.assertTrue(userRegistration.validPasswordRule3("Ru@pali10"));
                System.out.println("Password Rule3 is valid");
            }catch (InvalidPasswordRule3Exception e) {
                System.out.println("Invalid Password Rule3 because :- " + e);
            }
        }

        @Test
        public void givenPasswordRule3_WhenInValid_ShouldReturnsFalse() {
            try {
                Assertions.assertTrue(userRegistration.validPasswordRule3("Ru@pal.i"));
                System.out.println("Password Rule3 is valid");
            }catch (InvalidPasswordRule3Exception e) {
                System.out.println("Invalid Password Rule3 because :- " + e);
            }
        }

        @Test
        public void givenPasswordRule4_WhenValid_ShouldReturnsTrue() {
            try {
                Assertions.assertTrue(userRegistration.validPasswordRule4("Rupali@10anap"));
                System.out.println("Password Rule4 is valid");
            }catch (InvalidPasswordRule4Exception e) {
                System.out.println("Invalid Password Rule4 because :- " + e);
            }
        }

        @Test
        public void givenPasswordRule4_WhenInValid_ShouldReturnsFalse() {
            try {
                Assertions.assertTrue(userRegistration.validPasswordRule4("Rup1a10li"));
                System.out.println("Password Rule4 is valid");
            } catch (InvalidPasswordRule4Exception e) {
                System.out.println("Invalid Password Rule4 because :- " + e);
            }
        }
    }