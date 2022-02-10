package com.tpp.demo.designpattern.factory.whyfactoryisrequired;

import com.tpp.demo.designpattern.factory.constants.PizzaTypes;

public class PizzaFactoryMethodMain {
    public static void main(String[] args) {
        PizzaStore pizza = new PizzaStore();
        pizza.order(PizzaTypes.Cheese.name());
    }
}
