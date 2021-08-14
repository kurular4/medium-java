package com.omer.medium.completablefuture;

public class TextProcessor implements Runnable {

    @Override
    public void run() {
        // Process downloaded text
        System.out.println("I am taking the text from the location and processing the text");
    }
}