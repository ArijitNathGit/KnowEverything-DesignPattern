package com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.lisbon;

import com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.Pizza;

public class LisbonPepperoniPizza extends Pizza {
    public LisbonPepperoniPizza() {
        this.pizzaName = "Lisbon Pepperoni";
    }

    @Override
    protected void prepare() {
        System.out.println(pizzaName + " Pizza");
    }
}
