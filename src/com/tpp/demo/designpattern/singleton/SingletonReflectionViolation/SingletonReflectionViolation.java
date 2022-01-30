package com.tpp.demo.designpattern.singleton.SingletonReflectionViolation;

public class SingletonReflectionViolation {
    private static SingletonReflectionViolation INSTANCE_SINGLETON_VIOLATION;

    private SingletonReflectionViolation() {}

    public static SingletonReflectionViolation getInstance() {
        if (INSTANCE_SINGLETON_VIOLATION == null) {
            INSTANCE_SINGLETON_VIOLATION = new SingletonReflectionViolation();
        }

        return INSTANCE_SINGLETON_VIOLATION;
    }
}
