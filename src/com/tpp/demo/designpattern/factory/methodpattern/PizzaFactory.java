package com.tpp.demo.designpattern.factory.methodpattern;

import com.tpp.demo.designpattern.factory.constants.PizzaTypes;

public class PizzaFactory {
    public Pizza createPizza(String pizzaType) {
        if(PizzaTypes.Pepperoni.name().equals(pizzaType))       return new PepperoniPizza();
        else if(PizzaTypes.Sausage.name().equals(pizzaType))    return new SausagePizza();
        else if(PizzaTypes.Cheese.name().equals(pizzaType))     return new CheesePizza();
        else if(PizzaTypes.Veg.name().equals(pizzaType))        return new VegPizza();

        return null;
    }
}
