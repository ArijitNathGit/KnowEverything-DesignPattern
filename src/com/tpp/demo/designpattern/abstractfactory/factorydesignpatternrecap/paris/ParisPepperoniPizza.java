package com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.paris;

import com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.Pizza;

public class ParisPepperoniPizza extends Pizza {
    public ParisPepperoniPizza() {
        this.pizzaName = "Paris Pepperoni";
    }

    @Override
    protected void prepare() {
        System.out.println(pizzaName + " Pizza");
    }
}
