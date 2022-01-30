package com.tpp.demo.designpattern.singleton.LazyInitialization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LazySingletonMain {
    public static void main(String[] args) {
        executeLazy();
       // executeLazyThread();
    }

    private static void executeLazy() {
        LazyInitialization lazyObj1 = LazyInitialization.getInstance();
        LazyInitialization lazyObj2 = LazyInitialization.getInstance();
        System.out.println("Lazy Object 1: " + lazyObj1);
        System.out.println("Lazy Object 2: " + lazyObj2);
        System.out.println();
    }

    private static void executeLazyThread() {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(() -> {
            LazyInitialization lazyThreadObj1 = LazyInitialization.getInstance();
            System.out.println("Lazy Thread Object 1: " + lazyThreadObj1);
        });

        executor.submit(() -> {
            LazyInitialization lazyThreadObj2 = LazyInitialization.getInstance();
            System.out.println("Lazy Thread Object 2: " + lazyThreadObj2);
        });

        executor.shutdown();
    }
}
