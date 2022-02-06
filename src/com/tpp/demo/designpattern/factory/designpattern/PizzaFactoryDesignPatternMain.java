package com.tpp.demo.designpattern.factory.designpattern;

import com.tpp.demo.designpattern.factory.constants.PizzaTypes;

public class PizzaFactoryDesignPatternMain {
    public static void main(String[] args) {
        PizzaStore londonPizzaStore = new LondonPizzaStore();
        londonPizzaStore.order(PizzaTypes.Cheese.name());

        System.out.println();

        PizzaStore parisPizzaStore = new ParisPizzaStore();
        parisPizzaStore.order(PizzaTypes.Pepperoni.name());

        System.out.println();

        PizzaStore lisbonPizzaStore = new LisbonPizzaStore();
        lisbonPizzaStore.order(PizzaTypes.Sausage.name());
    }
}
