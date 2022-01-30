package com.tpp.demo.designpattern.singleton.DCLInitialization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DCLSingletonMain {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> {
            DoubleCheckLockingInitialization dclThreadObj1 = DoubleCheckLockingInitialization.getInstance();
            System.out.println("DCL Thread Object 1: " + dclThreadObj1);
        });

        executor.submit(() -> {
            DoubleCheckLockingInitialization dclThreadObj2 = DoubleCheckLockingInitialization.getInstance();
            System.out.println("DCL Thread Object 2: " + dclThreadObj2);
        });

        executor.shutdown();
    }
}
