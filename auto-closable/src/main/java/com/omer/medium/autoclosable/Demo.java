package com.omer.medium.autoclosable;

import java.net.UnknownHostException;

public class Demo {
    public static void main(String[] args) {
        try (Connection connection = new Connection()) {
            connection.connect();
            // do something with connection
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
