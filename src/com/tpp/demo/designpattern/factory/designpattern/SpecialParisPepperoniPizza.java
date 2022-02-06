package com.tpp.demo.designpattern.factory.designpattern;

public class SpecialParisPepperoniPizza extends Pizza {
    public SpecialParisPepperoniPizza() {
        this.pizzaName = "Special Paris Pepperoni";
    }

    @Override
    protected void prepare() {
        System.out.println("Thin crust " + pizzaName + " Pizza");
    }
}
