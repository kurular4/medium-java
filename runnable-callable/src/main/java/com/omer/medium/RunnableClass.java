package com.omer.medium;

public class RunnableClass implements Runnable {
    private final ListenerRegistry listenerRegistry;

    public RunnableClass(ListenerRegistry listenerRegistry) {
        this.listenerRegistry = listenerRegistry;
    }

    @Override
    public void run() {
       listenerRegistry.subscribe(System.out::println);
    }
}
