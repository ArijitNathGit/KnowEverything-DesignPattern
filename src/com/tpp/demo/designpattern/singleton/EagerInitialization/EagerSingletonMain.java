package com.tpp.demo.designpattern.singleton.EagerInitialization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EagerSingletonMain {
    public static void main(String[] args) {
        executeEager();
        //executeEagerThread();
    }

    private static void executeEager() {
        EagerInitialization eagerObj1 = EagerInitialization.getInstance();
        EagerInitialization eagerObj2 = EagerInitialization.getInstance();
        System.out.println("Eager Object 1: " + eagerObj1);
        System.out.println("Eager Object 2: " + eagerObj2);
        System.out.println();
    }

    private static void executeEagerThread() {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(() -> {
            EagerInitialization eagerThreadObj1 = EagerInitialization.getInstance();
            System.out.println("Eager Thread Object 1: " + eagerThreadObj1);
        });
        executor.submit(() -> {
            EagerInitialization eagerThreadObj2 = EagerInitialization.getInstance();
            System.out.println("Eager Thread Object 2: " + eagerThreadObj2);
        });

        executor.shutdown();
    }
}
