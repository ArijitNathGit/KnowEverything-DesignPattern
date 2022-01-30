package com.tpp.demo.designpattern.singleton.EagerInitialization;

public class EagerExecutionThread2 implements Runnable{

    @Override
    public void run() {
        EagerInitialization eagerThreadObj2 = EagerInitialization.getInstance();
        System.out.println("Eager Thread Object 2: " + eagerThreadObj2);
    }
}
