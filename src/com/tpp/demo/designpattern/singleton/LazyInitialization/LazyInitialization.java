package com.tpp.demo.designpattern.singleton.LazyInitialization;

public class LazyInitialization {
    private static LazyInitialization INSTANCE_LAZY;

    private LazyInitialization() {}

    public static synchronized LazyInitialization getInstance() {
        if (INSTANCE_LAZY == null) {
            INSTANCE_LAZY = new LazyInitialization();
        }

        return INSTANCE_LAZY;
    }
}
