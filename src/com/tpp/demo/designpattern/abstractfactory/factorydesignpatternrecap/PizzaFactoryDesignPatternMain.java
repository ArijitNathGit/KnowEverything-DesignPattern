package com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap;

import com.tpp.demo.designpattern.abstractfactory.constants.PizzaTypes;
import com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.lisbon.LisbonPizzaStore;
import com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.london.LondonPizzaStore;
import com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.paris.ParisPizzaStore;

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
