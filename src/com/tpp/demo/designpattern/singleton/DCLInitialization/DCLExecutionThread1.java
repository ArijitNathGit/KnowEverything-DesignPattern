package com.tpp.demo.designpattern.singleton.DCLInitialization;

public class DCLExecutionThread1 implements Runnable{

    @Override
    public void run() {
        DoubleCheckLockingInitialization dclThreadObj1 = DoubleCheckLockingInitialization.getInstance();
        System.out.println("DCL Thread Object 1: " + dclThreadObj1);
    }
}
