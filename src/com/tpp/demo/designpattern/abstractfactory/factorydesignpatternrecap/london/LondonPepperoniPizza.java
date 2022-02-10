package com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.london;

import com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.Pizza;

public class LondonPepperoniPizza extends Pizza {
    public LondonPepperoniPizza() {
        this.pizzaName = "London Pepperoni";
    }

    @Override
    protected void prepare() {
        System.out.println(pizzaName + " Pizza");
    }
}
