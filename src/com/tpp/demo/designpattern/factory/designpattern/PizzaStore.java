package com.tpp.demo.designpattern.factory.designpattern;

public abstract class PizzaStore {

    public void order(String pizzaType) {
        Pizza pizza = createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    protected abstract Pizza createPizza(String pizzaType);
}
