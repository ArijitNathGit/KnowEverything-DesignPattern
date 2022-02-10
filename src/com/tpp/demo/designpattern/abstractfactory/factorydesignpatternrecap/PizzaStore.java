package com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap;

public abstract class PizzaStore {
    protected String pizzaName;

    public void order(String pizzaType) {
        Pizza pizza = createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    protected abstract Pizza createPizza(String pizzaType);
}