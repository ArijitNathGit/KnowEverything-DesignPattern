package com.tpp.demo.designpattern.singleton.EagerInitialization;

public class EagerInitialization {
    private static final EagerInitialization INSTANCE_EAGER = new EagerInitialization();

    private EagerInitialization() {}

    public static EagerInitialization getInstance() {
        return INSTANCE_EAGER;
    }
}
