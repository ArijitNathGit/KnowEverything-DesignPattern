package com.tpp.demo.designpattern.singleton.SingletonReflectionViolation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonReflectionViolationMain {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SingletonReflectionViolation singletonRVObj1 = SingletonReflectionViolation.getInstance();
        SingletonReflectionViolation singletonRVObj2 = SingletonReflectionViolation.getInstance();
        System.out.println("Singleton before reflection violation Object 1: " + singletonRVObj1);
        System.out.println("Singleton before reflection violation Object 2: " + singletonRVObj2);
        System.out.println();

        Class singletonClass = Class.forName("com.tpp.demo.designpattern.singleton.SingletonReflectionViolation.SingletonReflectionViolation");
        Constructor<SingletonReflectionViolation> singletonClassConstructor = singletonClass.getDeclaredConstructor();
        singletonClassConstructor.setAccessible(Boolean.TRUE);

        SingletonReflectionViolation singletonRVObj3 = singletonClassConstructor.newInstance();
        System.out.println("Singleton after reflection violation Object 3: " + singletonRVObj3);
        SingletonReflectionViolation singletonRVObj4 = singletonClassConstructor.newInstance();
        System.out.println("Singleton after reflection violation Object 4: " + singletonRVObj4);
    }
}
