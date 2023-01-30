package com.bridgelabz;
import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the options:\n1. Validate First Name\n2. Validate Last Name\n3. Validate Email ID\n4. Validate Mobile Number" +
                "\n5. Validate Password Rule1\n6. Validate Password Rule2\n7. Validate Password Rule3\n8. Validate Password Rule4");

        switch (scanner.nextInt()) {
            case 1:
                UserRegistration.validFirstName("Rupali");
                break;
            case 2:
                UserRegistration.validLastName("Anap");
                break;
            case 3:
                UserRegistration.validEmail("abc.xyz@bl.co.in");
                break;
            case 4:
                UserRegistration.validMobileNumber("91 7083409631");
                break;
            case 5:
                UserRegistration.validPasswordRule1("Rupali@10");
                break;
            case 6:
                UserRegistration.validPasswordRule2("Rupali@10-12");
                break;
            case 7:
                UserRegistration.validPasswordRule3("Rupali1@102");
                break;
            case 8:
                UserRegistration.validPasswordRule4("Rupali10@10Garole");
                break;
        }
    }
}