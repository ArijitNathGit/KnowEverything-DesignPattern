package com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.lisbon;

import com.tpp.demo.designpattern.abstractfactory.constants.PizzaTypes;
import com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.Pizza;
import com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.PizzaStore;

public class LisbonPizzaStore extends PizzaStore {
    
    @Override
    protected Pizza createPizza(String pizzaType) {
        if(PizzaTypes.Pepperoni.name().equals(pizzaType))       return new LisbonPepperoniPizza();
        else if(PizzaTypes.Sausage.name().equals(pizzaType))    return new LisbonSausagePizza();
        else if(PizzaTypes.Cheese.name().equals(pizzaType))     return new LisbonCheesePizza();
        else if(PizzaTypes.Veg.name().equals(pizzaType))        return new LisbonVegPizza();

        return null;
    }
}
