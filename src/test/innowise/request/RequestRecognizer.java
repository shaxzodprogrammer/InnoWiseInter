package test.innowise.request;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RequestRecognizer {
    public Request recognizeRequest(BufferedReader reader, HashMap<Integer, Request> requests) {
        while (true) {
            int numberOfRequest = -1;
            try {
                numberOfRequest = Integer.parseInt(reader.readLine());
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }
            for (Map.Entry<Integer, Request> entry : requests.entrySet()) {
                if (entry.getKey().equals(numberOfRequest)) {
                    return entry.getValue();
                }
            }
            System.out.println("Invalid request, try again.");
        }
    }

    public boolean isContinue(BufferedReader reader) {
        String answer = null;
        while (true) {
            try {
                answer = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if ("Y".equalsIgnoreCase(answer)) {
                return true;
            } else if ("N".equalsIgnoreCase(answer)) {
                return false;
            } else {
                System.out.println("Invalid request, try again.");
            }
        }
    }

    public int recognizeNumberOfRequest(BufferedReader reader, int variants) {
        int request = -1;
        while (true) {
            try {
                request = Integer.parseInt(reader.readLine());
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }
            if (request > 0 && request <= variants) {
                return request;
            } else {
                System.out.println("Invalid request, try again.");
            }
        }
    }
}
