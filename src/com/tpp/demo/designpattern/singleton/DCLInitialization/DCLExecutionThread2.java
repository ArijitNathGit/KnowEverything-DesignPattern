package com.tpp.demo.designpattern.singleton.DCLInitialization;

public class DCLExecutionThread2 implements Runnable{

    @Override
    public void run() {
        DoubleCheckLockingInitialization dclThreadObj2 = DoubleCheckLockingInitialization.getInstance();
        System.out.println("DCL Thread Object 2: " + dclThreadObj2);
    }
}
