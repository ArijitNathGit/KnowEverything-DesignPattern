package com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.london;

import com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.Pizza;

public class LondonSausagePizza extends Pizza {
    public LondonSausagePizza() {
        this.pizzaName = "London Sausage";
    }

    @Override
    protected void prepare() {
        System.out.println(pizzaName + " Pizza");
    }
}
