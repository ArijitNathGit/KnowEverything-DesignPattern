package com.tpp.demo.designpattern.factory.designpattern;

public class SpecialLondonCheesePizza extends Pizza {
    public SpecialLondonCheesePizza() {
        this.pizzaName = "Special London Cheese";
    }

    @Override
    protected void prepare() {
        System.out.println("Cheese Burst " + pizzaName + " Pizza");
    }
}
