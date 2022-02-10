package com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.paris;

import com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.Pizza;

public class ParisSausagePizza extends Pizza {
    public ParisSausagePizza() {
        this.pizzaName = "Paris Sausage";
    }

    @Override
    protected void prepare() {
        System.out.println(pizzaName + " Pizza");
    }
}
