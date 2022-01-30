package com.tpp.demo.designpattern.singleton.SynchronizedInitialization;

public class SynchronizedExecutionThread1 implements Runnable{

    @Override
    public void run() {
        SynchronizedInitialization syncThreadObj1 = SynchronizedInitialization.getInstance();
        System.out.println("Synchronized Thread Object 1: " + syncThreadObj1);
    }
}
