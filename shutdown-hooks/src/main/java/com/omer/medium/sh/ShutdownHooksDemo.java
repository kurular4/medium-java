package com.omer.medium.sh;

public class ShutdownHooksDemo {
    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new CustomShutdownHook(new NetworkService()));
    }
}
