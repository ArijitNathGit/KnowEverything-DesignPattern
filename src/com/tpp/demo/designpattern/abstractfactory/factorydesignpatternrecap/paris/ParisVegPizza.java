package com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.paris;

import com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.Pizza;

public class ParisVegPizza extends Pizza {
    public ParisVegPizza() {
        this.pizzaName = "Paris Veg";
    }

    @Override
    protected void prepare() {
        System.out.println(pizzaName + " Pizza");
    }
}
