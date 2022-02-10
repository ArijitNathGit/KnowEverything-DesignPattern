package com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.london;

import com.tpp.demo.designpattern.abstractfactory.constants.PizzaTypes;
import com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.Pizza;
import com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.PizzaStore;

public class LondonPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String pizzaType) {
        if(PizzaTypes.Pepperoni.name().equals(pizzaType))       return new LondonPepperoniPizza();
        else if(PizzaTypes.Sausage.name().equals(pizzaType))    return new LondonSausagePizza();
        else if(PizzaTypes.Cheese.name().equals(pizzaType))     return new LondonCheesePizza();
        else if(PizzaTypes.Veg.name().equals(pizzaType))        return new LondonVegPizza();

        return null;
    }
}
