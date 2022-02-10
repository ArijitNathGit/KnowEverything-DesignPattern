package com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.lisbon;

import com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.Pizza;

public class LisbonSausagePizza extends Pizza {
    public LisbonSausagePizza() {
        this.pizzaName = "Special Lisbon Sausage";
    }

    @Override
    protected void prepare() {
        System.out.println(pizzaName + " Pizza");
    }
}
