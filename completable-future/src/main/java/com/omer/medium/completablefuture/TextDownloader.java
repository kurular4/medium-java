package com.omer.medium.completablefuture;

public class TextDownloader implements Runnable {

    @Override
    public void run() {
        // Download text from server
        System.out.println("I am downloading the file containing text to a directory");
        try {
            Thread.sleep(2000); // for simulating download wait time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
