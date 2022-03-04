package test.innowise.request;

import java.io.BufferedReader;

public interface Request {
    void fulfillRequest(BufferedReader reader);
}
