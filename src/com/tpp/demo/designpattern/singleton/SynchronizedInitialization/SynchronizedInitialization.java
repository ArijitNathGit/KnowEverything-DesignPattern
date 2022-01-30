package com.tpp.demo.designpattern.singleton.SynchronizedInitialization;

public class SynchronizedInitialization {
    private static volatile SynchronizedInitialization INSTANCE_SYNCHRONIZED;

    private SynchronizedInitialization() {}

    public static SynchronizedInitialization getInstance() {
        if (INSTANCE_SYNCHRONIZED == null) {
            synchronized (SynchronizedInitialization.class) {
                INSTANCE_SYNCHRONIZED = new SynchronizedInitialization();
            }
        }

        return INSTANCE_SYNCHRONIZED;
    }
}
