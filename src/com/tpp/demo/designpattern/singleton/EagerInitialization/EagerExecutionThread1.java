package com.tpp.demo.designpattern.singleton.EagerInitialization;

public class EagerExecutionThread1 implements Runnable{

    @Override
    public void run() {
        EagerInitialization eagerThreadObj1 = EagerInitialization.getInstance();
        System.out.println("Eager Thread Object 1: " + eagerThreadObj1);
    }
}
