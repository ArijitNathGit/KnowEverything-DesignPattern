package com.tpp.demo.designpattern.singleton.SingletonCloneViolation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonCloneViolationFixMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        SingletonCloneViolationFix singletonCVObj1 = SingletonCloneViolationFix.getInstance();
        SingletonCloneViolationFix singletonCVObj2 = SingletonCloneViolationFix.getInstance();
        System.out.println("Singleton before reflection violation Object 1: " + singletonCVObj1);
        System.out.println("Singleton before reflection violation Object 2: " + singletonCVObj2);
        System.out.println();

        SingletonCloneViolationFix singletonCVObj3 = (SingletonCloneViolationFix) singletonCVObj2.clone();
        System.out.println("Singleton after clone violation Object 3: " + singletonCVObj3);
        SingletonCloneViolationFix singletonCVObj4 = (SingletonCloneViolationFix) singletonCVObj2.clone();
        System.out.println("Singleton after clone violation Object 4: " + singletonCVObj4);
    }
}
