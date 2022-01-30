package com.tpp.demo.designpattern.singleton.DCLInitialization;

public class DoubleCheckLockingInitialization {
    private static volatile DoubleCheckLockingInitialization INSTANCE_DCL;

    private DoubleCheckLockingInitialization() {}

    public static DoubleCheckLockingInitialization getInstance() {
        if (INSTANCE_DCL == null) {
            synchronized (DoubleCheckLockingInitialization.class) {
                if(INSTANCE_DCL == null) {
                    INSTANCE_DCL = new DoubleCheckLockingInitialization();
                }
            }
        }

        return INSTANCE_DCL;
    }
}
