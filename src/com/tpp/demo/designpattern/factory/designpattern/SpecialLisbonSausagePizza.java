package com.tpp.demo.designpattern.factory.designpattern;

public class SpecialLisbonSausagePizza extends Pizza {
    public SpecialLisbonSausagePizza() {
        this.pizzaName = "Special Lisbon Sausage";
    }

    @Override
    protected void prepare() {
        System.out.println("Extra Sausage " + pizzaName + " Pizza");
    }
}
