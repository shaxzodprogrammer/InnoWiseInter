package test.innowise;

import test.innowise.validator.*;
import java.io.BufferedReader;
import java.io.IOException;

public class ConsoleReader {
    public String readName(BufferedReader reader) {
        String name = null;
        NameValidator nameValidator = new NameValidator();
        while (true) {
            try {
                name = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (nameValidator.isValid(name)) {
                return name;
            } else {
                System.out.println("Incorrect input, try again.");
            }
        }
    }

    public String readEmail(BufferedReader reader) {
        String email = null;
        EmailValidation emailValidator = new EmailValidation();
        while (true) {
            try {
                email = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (emailValidator.isValid(email)) {
                return email;
            } else {
                System.out.println("Incorrect input, try again.");
            }
        }
    }

    public String readRole(BufferedReader reader, int level) {
        String role = null;
        RoleValidator roleValidator = new RoleValidator();
        while (true) {
            try {
                role = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (role != null) {
                if ("N".equalsIgnoreCase(role)) {
                    return null;
                } else if (roleValidator.isAcceptableRole(role, level)) {
                    return role.toUpperCase();
                }
            }
            System.out.println("Invalid request, try again.");
        }
    }

    public String readPhone(BufferedReader reader, boolean isFirstNumber) {
        String phone = null;
        PhoneValidator phoneValidator = new PhoneValidator();
        while (true) {
            try {
                phone = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (phone != null) {
                if (!isFirstNumber && "N".equalsIgnoreCase(phone)) {
                    return null;
                }
                if (phoneValidator.isValid(phone)) {
                    return phone.replaceAll("\\s+", "");
                }
            }
            System.out.println("Invalid request, try again.");
        }
    }

    public int readUserNumber(BufferedReader reader) {
        UserNumberValidator userNumberValidator = new UserNumberValidator();
        int number = -1;
        while (true) {
            try {
                number = Integer.parseInt(reader.readLine());
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }
            if (userNumberValidator.isValid(number)) {
                return number;
            } else {
                System.out.println("Invalid number, try again.");
            }
        }
    }
}
