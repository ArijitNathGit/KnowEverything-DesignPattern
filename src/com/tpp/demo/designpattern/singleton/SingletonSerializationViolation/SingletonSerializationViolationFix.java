package com.tpp.demo.designpattern.singleton.SingletonSerializationViolation;

import java.io.Serializable;

public class SingletonSerializationViolationFix implements Serializable {
    private static final long serialVersionUID = 1L;
    private static SingletonSerializationViolationFix INSTANCE_SINGLETON_VIOLATION_FIX;

    private SingletonSerializationViolationFix() {}

    public static SingletonSerializationViolationFix getInstance() throws InstantiationException {
        if (INSTANCE_SINGLETON_VIOLATION_FIX == null) {
            INSTANCE_SINGLETON_VIOLATION_FIX = new SingletonSerializationViolationFix();
        }

        return INSTANCE_SINGLETON_VIOLATION_FIX;
    }

    private Object readResolve() {
        System.out.println("Perform readResolve!");
        return INSTANCE_SINGLETON_VIOLATION_FIX;
    }
}
