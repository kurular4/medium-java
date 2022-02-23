package com.omer.medium.autoclosable;

import java.net.UnknownHostException;

public class Connection implements AutoCloseable {

    public Connection() {
        System.out.println("Connection created");
    }

    public void connect() throws UnknownHostException {
        System.out.println("Connected");
    }

    public void disconnect() {
        System.out.println("Disconnected");
    }

    @Override
    public void close() {
        disconnect();
    }
}
