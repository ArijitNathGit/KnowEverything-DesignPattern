package com.tpp.demo.designpattern.singleton.SynchronizedInitialization;

public class SynchronizedExecutionThread2 implements Runnable{

    @Override
    public void run() {
        SynchronizedInitialization syncThreadObj2 = SynchronizedInitialization.getInstance();
        System.out.println("Synchronized Thread Object 2: " + syncThreadObj2);
    }
}
