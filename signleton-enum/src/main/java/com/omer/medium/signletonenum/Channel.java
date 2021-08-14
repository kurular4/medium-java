package com.omer.medium.signletonenum;

public enum Channel {
    INSTANCE;

    public void open() {
        // logic for opening channel
    }

    public void close() {
        // logic for closing channel
    }

    public boolean isOpen() {
        return true;
    }
}