package com.tpp.demo.designpattern.singleton.SingletonReflectionViolation;

public class SingletonReflectionViolationFix {
    private static SingletonReflectionViolationFix INSTANCE_SINGLETON_VIOLATION_FIX;

    private SingletonReflectionViolationFix() throws InstantiationException {
        if( INSTANCE_SINGLETON_VIOLATION_FIX != null )
            throw new InstantiationException("Cannot create instance of a Singleton Class using constructor. " +
                    "Use the getInstance static method!");
    }

    public static SingletonReflectionViolationFix getInstance() throws InstantiationException {
        if (INSTANCE_SINGLETON_VIOLATION_FIX == null) {
            INSTANCE_SINGLETON_VIOLATION_FIX = new SingletonReflectionViolationFix();
        }

        return INSTANCE_SINGLETON_VIOLATION_FIX;
    }
}
