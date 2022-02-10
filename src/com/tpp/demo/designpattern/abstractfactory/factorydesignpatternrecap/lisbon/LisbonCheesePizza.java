package com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.lisbon;

import com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.Pizza;

public class LisbonCheesePizza extends Pizza {
    public LisbonCheesePizza() {
        this.pizzaName = "Lisbon Cheese";
    }

    @Override
    protected void prepare() {
        System.out.println(pizzaName + " Pizza");
    }
}
