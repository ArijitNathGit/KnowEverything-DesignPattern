package com.tpp.demo.designpattern.singleton.SingletonCloneViolation;

public class SingletonCloneViolationFix implements Cloneable {
    private static SingletonCloneViolationFix INSTANCE_SINGLETON_VIOLATION_FIX;

    private SingletonCloneViolationFix() {}

    public static SingletonCloneViolationFix getInstance() {
        if (INSTANCE_SINGLETON_VIOLATION_FIX == null) {
            INSTANCE_SINGLETON_VIOLATION_FIX = new SingletonCloneViolationFix();
        }

        return INSTANCE_SINGLETON_VIOLATION_FIX;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cannot clone instance of a Singleton Class using clone method. " +
                "Use the getInstance static method!");
    }
}
