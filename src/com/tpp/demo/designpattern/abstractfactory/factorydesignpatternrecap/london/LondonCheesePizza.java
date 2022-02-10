package com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.london;

import com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.Pizza;

public class LondonCheesePizza extends Pizza {
    public LondonCheesePizza() {
        this.pizzaName = "London Cheese";
    }

    @Override
    protected void prepare() {
        System.out.println("Cheese Burst " + pizzaName + " Pizza");
    }
}
