package com.omer.medium.completablefuture;

import java.util.function.Supplier;

public class TextDownloader2 implements Supplier<String> {

    @Override
    public String get() {
        System.out.println("I am downloading the file containing text to a directory");
        try {
            Thread.sleep(2000); // for simulating download wait time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "pathToDownloadedFile";
    }
}
