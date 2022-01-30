package com.tpp.demo.designpattern.singleton.SynchronizedInitialization;

import com.tpp.demo.designpattern.singleton.BillPughInitialization.BillPughInitialization;
import com.tpp.demo.designpattern.singleton.DCLInitialization.DCLExecutionThread1;
import com.tpp.demo.designpattern.singleton.DCLInitialization.DCLExecutionThread2;
import com.tpp.demo.designpattern.singleton.EagerInitialization.EagerExecutionThread1;
import com.tpp.demo.designpattern.singleton.EagerInitialization.EagerExecutionThread2;
import com.tpp.demo.designpattern.singleton.EagerInitialization.EagerInitialization;
import com.tpp.demo.designpattern.singleton.LazyInitialization.LazyExecutionThread1;
import com.tpp.demo.designpattern.singleton.LazyInitialization.LazyExecutionThread2;
import com.tpp.demo.designpattern.singleton.LazyInitialization.LazyInitialization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedSingletonMain {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> {
            SynchronizedInitialization syncThreadObj1 = SynchronizedInitialization.getInstance();
            System.out.println("Synchronized Thread Object 1: " + syncThreadObj1);
        });

        executor.submit(() -> {
            SynchronizedInitialization syncThreadObj2 = SynchronizedInitialization.getInstance();
            System.out.println("Synchronized Thread Object 2: " + syncThreadObj2);
        });

        executor.shutdown();
    }
}
