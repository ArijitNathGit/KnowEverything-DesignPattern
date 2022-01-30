package com.tpp.demo.designpattern.singleton.LazyInitialization;

public class LazyExecutionThread1 implements Runnable{

    @Override
    public void run() {
        LazyInitialization lazyThreadObj1 = LazyInitialization.getInstance();
        System.out.println("Lazy Thread Object 1: " + lazyThreadObj1);
    }
}
