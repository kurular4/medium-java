package com.omer.medium.delayqueue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedItem implements Delayed {
    private String name;
    private long startingTime;

    public DelayedItem(String name, long delay) {
        this.name = name;
        this.startingTime = System.currentTimeMillis() + delay;
    }

    public String getName() {
        return name;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long delay = startingTime - System.currentTimeMillis();
        return unit.toMillis(delay);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(startingTime, ((DelayedItem) o).startingTime);
    }
}