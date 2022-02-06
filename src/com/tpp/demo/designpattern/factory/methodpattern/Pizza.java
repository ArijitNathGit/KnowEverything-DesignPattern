package com.tpp.demo.designpattern.factory.methodpattern;

public abstract class Pizza {
    protected String pizzaName;

    protected void prepare() {
        System.out.println("Preparing " + pizzaName +" Pizza");
    }
    protected void bake() {
        System.out.println("Baking " + pizzaName +" Pizza");
    }
    protected void cut() {
        System.out.println("Cutting " + pizzaName +" Pizza");
    }
    protected void box() {
        System.out.println("Boxing " + pizzaName +" Pizza");
    }
}
