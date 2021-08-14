package com.omer.medium.rc;

import java.util.concurrent.TimeUnit;

public class StringValidator {

    public static boolean isValid(String str) {
        try {
            TimeUnit.SECONDS.sleep(20); // to imitate long running task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }
}
