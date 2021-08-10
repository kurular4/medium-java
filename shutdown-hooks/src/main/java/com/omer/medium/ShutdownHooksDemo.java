package com.omer.medium;

public class ShutdownHooksDemo {
    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new CustomShutdownHook(new NetworkService()));

    }
}
