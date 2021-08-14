package com.omer.medium.rc;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        Callable<Boolean> callable = new CallableClass("sometext");
        Future<Boolean> result = executorService2.submit(callable);
        System.out.println(result.get().booleanValue()); // result future will return result when ready, this will also throws InterruptedException, ExecutionException but omitted here for clean sight.
    }
}
