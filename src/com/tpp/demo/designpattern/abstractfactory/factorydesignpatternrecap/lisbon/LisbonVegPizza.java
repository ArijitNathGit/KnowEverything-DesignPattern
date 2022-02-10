package com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.lisbon;

import com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.Pizza;

public class LisbonVegPizza extends Pizza {
    public LisbonVegPizza() {
        this.pizzaName = "Lisbon Veg";
    }

    @Override
    protected void prepare() {
        System.out.println(pizzaName + " Pizza");
    }
}
