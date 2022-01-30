package com.tpp.demo.designpattern.singleton.SingletonReflectionViolation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonReflectionViolationFixMain {
    public static void main(String[] args) throws Exception {
        SingletonReflectionViolationFix singletonRVObj1 = SingletonReflectionViolationFix.getInstance();
        SingletonReflectionViolationFix singletonRVObj2 = SingletonReflectionViolationFix.getInstance();
        System.out.println("Singleton before reflection violation Object 1: " + singletonRVObj1);
        System.out.println("Singleton before reflection violation Object 2: " + singletonRVObj2);
        System.out.println();

        Class singletonClass = Class.forName("com.tpp.demo.designpattern.singleton.SingletonReflectionViolation.SingletonReflectionViolationFix");
        Constructor<SingletonReflectionViolationFix> singletonClassConstructor = singletonClass.getDeclaredConstructor();
        singletonClassConstructor.setAccessible(Boolean.TRUE);

        SingletonReflectionViolationFix singletonRVObj3 = singletonClassConstructor.newInstance();
        System.out.println("Singleton after reflection violation Object 3: " + singletonRVObj3);
        SingletonReflectionViolationFix singletonRVObj4 = singletonClassConstructor.newInstance();
        System.out.println("Singleton after reflection violation Object 4: " + singletonRVObj4);
    }
}
