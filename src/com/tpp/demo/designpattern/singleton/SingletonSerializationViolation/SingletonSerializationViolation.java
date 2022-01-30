package com.tpp.demo.designpattern.singleton.SingletonSerializationViolation;

import java.io.Serializable;

public class SingletonSerializationViolation implements Serializable {
    private static SingletonSerializationViolation INSTANCE_SINGLETON_VIOLATION;

    private SingletonSerializationViolation() {}

    public static SingletonSerializationViolation getInstance() {
        if (INSTANCE_SINGLETON_VIOLATION == null) {
            INSTANCE_SINGLETON_VIOLATION = new SingletonSerializationViolation();
        }

        return INSTANCE_SINGLETON_VIOLATION;
    }
}
