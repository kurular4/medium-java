package com.omer.medium.sh;

public class CustomShutdownHook extends Thread {
    private final NetworkService networkService;

    public CustomShutdownHook(NetworkService networkService) {
        this.networkService = networkService;
    }

    @Override
    public void run() {
        if (networkService.isConnected()) {
            networkService.disconnect();
        }
    }
}
