package com.tpp.demo.designpattern.factory.methodpattern;

import com.tpp.demo.designpattern.factory.constants.PizzaTypes;

public class PizzaFactoryMethodMain {
    public static void main(String[] args) {
        PizzaStore pizza = new PizzaStore(new PizzaFactory());
        pizza.order(PizzaTypes.Cheese.name());
    }
}
