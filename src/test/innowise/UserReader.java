package test.innowise;

import test.innowise.enums.Roles;

import java.io.BufferedReader;

public class UserReader {
    public User readUserFromConsole(BufferedReader reader) {
        User user = new User();
        ConsoleReader consoleReader = new ConsoleReader();

        //names

        System.out.println("Type first name:");
        user.setFirstName(consoleReader.readName(reader));
        System.out.println("Type last name:");
        user.setLastName(consoleReader.readName(reader));

        //email

        System.out.println("Type email:");
        user.setEmail(consoleReader.readEmail(reader));

        //roles

        System.out.println("Choose roles, you can select one of each level.\n");
        Roles.printRole();
        System.out.println("\nChoose first-level role, for choosing nothing type \"N\":");
        String firstLevelRole = consoleReader.readRole(reader, 1);
        user.setFirstLevelRole(firstLevelRole);

        System.out.println("Choose second-level role, for choosing nothing type \"N\":");
        String secondLevelRole = consoleReader.readRole(reader, 2);
        user.setSecondLevelRole(secondLevelRole);

        if (user.getFirstLevelRole() == null && user.getSecondLevelRole() == null) {
            System.out.println("Choose third-level role, for choosing nothing type \"N\":");
            String thirdLevelRole = consoleReader.readRole(reader, 3);
            user.setThirdLeveRole(thirdLevelRole);
        } else {
            user.setThirdLeveRole(null);
        }

        //phones

        System.out.println("Type first number:");
        user.setFirstPhoneNumber(consoleReader.readPhone(reader, true));
        System.out.println("Type second number, for choosing nothing type \"N\":");
        user.setSecondPhoneNumber(consoleReader.readPhone(reader, false));
        if (user.getSecondPhoneNumber() != null) {
            System.out.println("Type third number, for choosing nothing type \"N\":");
            user.setThirdPhoneNumber(consoleReader.readPhone(reader, false));
        }
        return user;
    }
}
