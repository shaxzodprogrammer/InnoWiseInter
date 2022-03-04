package test.innowise.request;

import test.innowise.ConsoleReader;
import test.innowise.User;
import test.innowise.UserReader;
import test.innowise.repository.UserRepository;

import java.io.BufferedReader;

public class EditUser implements Request{
    @Override
    public void fulfillRequest(BufferedReader reader) {
        System.out.println("Type \"1\" to edit or \"2\" to remove user.");
        RequestRecognizer requestRecognizer = new RequestRecognizer();
        int request = requestRecognizer.recognizeNumberOfRequest(reader, 2);
        if (request == 1) {
            editUser(reader);
        } else {
            removeUser(reader);
        }
    }

    public void editUser(BufferedReader reader) {
        UserRepository userRepository = new UserRepository();
        ConsoleReader consoleReader = new ConsoleReader();
        System.out.println("Type the number of the user to edit.");
        int number = consoleReader.readUserNumber(reader);
        System.out.println("Type new data.");
        UserReader userReader = new UserReader();
        User user = userReader.readUserFromConsole(reader);
        userRepository.setUser(number, user);
    }

    public void removeUser(BufferedReader reader) {
        UserRepository userRepository = new UserRepository();
        ConsoleReader consoleReader = new ConsoleReader();
        System.out.println("Print the number of the user to remove.");
        int number = consoleReader.readUserNumber(reader);
        userRepository.removeUser(number);
    }
}
