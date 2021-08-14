package com.omer.medium.completablefuture;

import java.util.function.Consumer;

public class TextProcessor2 implements Consumer<String> {

    @Override
    public void accept(String s) {
        // Process downloaded text
        System.out.println("I am taking the text from the location and processing the text");
        System.out.println("Path: " + s);
    }
}