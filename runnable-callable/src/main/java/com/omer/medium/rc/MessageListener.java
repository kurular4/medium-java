package com.omer.medium.rc;

@FunctionalInterface
public interface MessageListener {
    void onMessageReceived(String message);
}
