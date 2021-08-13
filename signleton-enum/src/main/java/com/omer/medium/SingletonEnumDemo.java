package com.omer.medium;

public class SingletonEnumDemo {
    public static void main(String[] args) {
        Channel.INSTANCE.open();
        Channel.INSTANCE.close();
        Channel.INSTANCE.isOpen();
    }
}
