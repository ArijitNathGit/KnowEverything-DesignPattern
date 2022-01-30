package com.tpp.demo.designpattern.singleton.SingletonCloneViolation;

public class SingletonCloneViolation implements Cloneable {
    private static SingletonCloneViolation INSTANCE_SINGLETON_VIOLATION;

    private SingletonCloneViolation() {}

    public static SingletonCloneViolation getInstance() {
        if (INSTANCE_SINGLETON_VIOLATION == null) {
            INSTANCE_SINGLETON_VIOLATION = new SingletonCloneViolation();
        }

        return INSTANCE_SINGLETON_VIOLATION;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
