package test.innowise.request;

import test.innowise.User;
import test.innowise.UserReader;
import test.innowise.repository.UserRepository;

import java.io.BufferedReader;

public class CreateUser implements Request {
    @Override
    public void fulfillRequest(BufferedReader reader) {
        createUser(reader);
    }

    public void createUser(BufferedReader reader) {
        System.out.println("Creating new user.");
        UserReader userReader = new UserReader();
        User user = userReader.readUserFromConsole(reader);
        UserRepository userRepository = new UserRepository();
        userRepository.addUser(user);
    }
}
