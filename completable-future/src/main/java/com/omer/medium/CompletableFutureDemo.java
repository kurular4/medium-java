package com.omer.medium;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
    public static void main(String[] args) {
        CompletableFuture
                .runAsync(new TextDownloader());

        CompletableFuture
                .runAsync(new TextDownloader())
                .thenRunAsync(new TextProcessor());

        CompletableFuture
                .supplyAsync(new TextDownloader2())
                .thenAccept(new TextProcessor2());

        CompletableFuture
                .supplyAsync(new TextDownloader2())
                .thenAccept(path -> {
                    // some logic
                });
    }
}
