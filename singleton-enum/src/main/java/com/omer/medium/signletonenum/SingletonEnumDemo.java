package com.omer.medium.signletonenum;

public class SingletonEnumDemo {
    public static void main(String[] args) {
        Channel.INSTANCE.open();
        Channel.INSTANCE.close();
        Channel.INSTANCE.isOpen();
    }
}
