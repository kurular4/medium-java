package com.omer.medium;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor(); // or any other executor
        ListenerRegistry listenerRegistry = new ListenerRegistry();
        Runnable r = new RunnableClass(listenerRegistry);

        //new Thread(r).start();
        //CompletableFuture.runAsync(r);
        executorService.execute(r);

        listenerRegistry.publish();
    }
}
