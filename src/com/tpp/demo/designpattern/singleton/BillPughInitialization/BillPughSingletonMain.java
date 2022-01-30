package com.tpp.demo.designpattern.singleton.BillPughInitialization;

import com.tpp.demo.designpattern.singleton.SynchronizedInitialization.SynchronizedExecutionThread1;
import com.tpp.demo.designpattern.singleton.SynchronizedInitialization.SynchronizedExecutionThread2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BillPughSingletonMain {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> {
            BillPughInitialization bpObj3 = BillPughInitialization.getInstance();
            System.out.println("BillPugh Object 1: " + bpObj3);
        });
        executor.submit(() -> {
            BillPughInitialization bpObj4 = BillPughInitialization.getInstance();
            System.out.println("BillPugh Object 1: " + bpObj4);
        });
        executor.shutdown();
    }

    public static void executeBP() {
        BillPughInitialization bpObj1 = BillPughInitialization.getInstance();
        BillPughInitialization bpObj2 = BillPughInitialization.getInstance();
        System.out.println("BillPugh Object 1: " + bpObj1);
        System.out.println("BillPugh Object 2: " + bpObj2);
        System.out.println();
    }

    public static void executeBPThread() {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> {
            BillPughInitialization bpObj3 = BillPughInitialization.getInstance();
            System.out.println("BillPugh Object 1: " + bpObj3);
        });
        executor.submit(() -> {
            BillPughInitialization bpObj4 = BillPughInitialization.getInstance();
            System.out.println("BillPugh Object 1: " + bpObj4);
        });
        executor.shutdown();
    }
}
