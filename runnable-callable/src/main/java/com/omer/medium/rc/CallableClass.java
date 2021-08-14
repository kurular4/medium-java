package com.omer.medium.rc;

import java.util.concurrent.Callable;

public class CallableClass implements Callable<Boolean> {
    private String raw;

    public CallableClass(String raw) {
        this.raw = raw;
    }

    @Override
    public Boolean call() {
        return StringValidator.isValid(raw);
    }
}