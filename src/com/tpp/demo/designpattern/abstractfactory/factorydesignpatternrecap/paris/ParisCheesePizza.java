package com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.paris;

import com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.Pizza;

public class ParisCheesePizza extends Pizza {
    public ParisCheesePizza() {
        this.pizzaName = "Paris Cheese";
    }

    @Override
    protected void prepare() {
        System.out.println(pizzaName + " Pizza");
    }
}
