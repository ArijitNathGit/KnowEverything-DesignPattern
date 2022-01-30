package com.tpp.demo.designpattern.singleton.SingletonCloneViolation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonCloneViolationMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        SingletonCloneViolation singletonCVObj1 = SingletonCloneViolation.getInstance();
        SingletonCloneViolation singletonCVObj2 = SingletonCloneViolation.getInstance();
        System.out.println("Singleton before clone violation Object 1: " + singletonCVObj1);
        System.out.println("Singleton before clone violation Object 2: " + singletonCVObj2);
        System.out.println();

        SingletonCloneViolation singletonCVObj3 = (SingletonCloneViolation) singletonCVObj1.clone();
        System.out.println("Singleton after clone violation Object 3: " + singletonCVObj3);
        SingletonCloneViolation singletonCVObj4 = (SingletonCloneViolation) singletonCVObj2.clone();
        System.out.println("Singleton after clone violation Object 4: " + singletonCVObj4);
    }
}
