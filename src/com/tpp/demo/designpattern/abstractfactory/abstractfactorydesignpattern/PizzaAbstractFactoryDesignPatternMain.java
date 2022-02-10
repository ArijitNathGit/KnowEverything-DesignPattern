package com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern;

import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.lisbon.LisbonPizzaStore;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.london.LondonPizzaStore;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.paris.ParisPizzaStore;
import com.tpp.demo.designpattern.abstractfactory.constants.PizzaTypes;

public class PizzaAbstractFactoryDesignPatternMain {
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
