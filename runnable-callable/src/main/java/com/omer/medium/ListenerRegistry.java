package com.omer.medium;

import java.util.ArrayList;
import java.util.List;

public class ListenerRegistry {
    private List<MessageListener> listeners = new ArrayList<>();

    public void subscribe(MessageListener messageListener) {
        listeners.add(messageListener);
    }

    public void publish() {
        while (true) {
            listeners.forEach(listener -> listener.onMessageReceived("Some message" + Math.random()*100));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
