package com.tpp.demo.designpattern.singleton.LazyInitialization;

public class LazyExecutionThread2 implements Runnable{

    @Override
    public void run() {
        LazyInitialization lazyThreadObj2 = LazyInitialization.getInstance();
        System.out.println("Lazy Thread Object 2: " + lazyThreadObj2);
    }
}
