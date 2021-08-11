package com.omer.medium;

@FunctionalInterface
public interface MessageListener {
    void onMessageReceived(String message);
}
