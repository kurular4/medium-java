package com.omer.medium.delayqueue;

import java.util.concurrent.DelayQueue;

public class DelayQueueDemo {

    public static void main(String[] args) {
        DelayQueue<DelayedItem> delayedItems = new DelayQueue<>();
        DelayedItem delayedItem1 = new DelayedItem("item1", 1000);
        DelayedItem delayedItem2 = new DelayedItem("item2", 500);
        DelayedItem delayedItem3 = new DelayedItem("item3", 750);
        DelayedItem delayedItem4 = new DelayedItem("item3", 1250);

        delayedItems.add(delayedItem1);
        delayedItems.add(delayedItem2);
        delayedItems.add(delayedItem3);
        delayedItems.add(delayedItem4);

        while (!delayedItems.isEmpty()) {
            try {
                System.out.println(delayedItems.take().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
