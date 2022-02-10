package com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.london;

import com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.Pizza;

public class LondonVegPizza extends Pizza {
    public LondonVegPizza() {
        this.pizzaName = "London Veg";
    }

    @Override
    protected void prepare() {
        System.out.println(pizzaName + " Pizza");
    }
}
