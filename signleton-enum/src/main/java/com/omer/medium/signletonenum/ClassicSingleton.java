package com.omer.medium.signletonenum;

public class ClassicSingleton {
    private static ClassicSingleton instance;

    private ClassicSingleton() {
    }

    public synchronized static ClassicSingleton getInstance() {
        if (instance == null) {
            instance = new ClassicSingleton();
        }
        return instance;
    }

    public void operate() {
        // some method
    }
}
