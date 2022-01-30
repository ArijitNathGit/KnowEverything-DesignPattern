package com.tpp.demo.designpattern.singleton.BillPughInitialization;

public class BillPughInitialization {
    private BillPughInitialization() {}

    public static BillPughInitialization getInstance() {
        return BillPughInitializationHolder.INSTANCE_BP;
    }

    private static class BillPughInitializationHolder {
        private static final BillPughInitialization INSTANCE_BP = new BillPughInitialization();
    }

}
