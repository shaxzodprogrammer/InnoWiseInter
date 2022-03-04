package test.innowise;

import test.innowise.repository.UserRepository;
import test.innowise.request.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final String PATH_TO_REPOSITORY = "C:\\Users\\rafae\\Documents\\My docs\\InnoWise\\innowiseTest-master\\src\\com\\company\\files\\user.ser";

    public static void main(String[] args) {
        HashMap<Integer, Request> requests = new HashMap<>();
        requests.put(1, new CreateUser());
        requests.put(2, new EditUser());
        requests.put(3, new Inspector());

        UserRepository userRepository = new UserRepository();
        userRepository.loadRepository(PATH_TO_REPOSITORY);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Input your request.");
            for (Map.Entry<Integer, Request> entry : requests.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue().getClass().getSimpleName());
            }
            RequestRecognizer requestRecognizer = new RequestRecognizer();
            Request request = requestRecognizer.recognizeRequest(reader, requests);
            request.fulfillRequest(reader);
            System.out.println("\nSomething else? Type \"Y\" or \"N\":");
            if (!requestRecognizer.isContinue(reader)) {
                break;
            }
        }
        userRepository.saveRepository(PATH_TO_REPOSITORY);
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
