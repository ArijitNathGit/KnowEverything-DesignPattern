package com.tpp.demo.designpattern.factory.designpattern;

import com.tpp.demo.designpattern.factory.constants.PizzaTypes;

public class ParisPizzaStore extends PizzaStore {
    
    @Override
    protected Pizza createPizza(String pizzaType) {
        if(PizzaTypes.Pepperoni.name().equals(pizzaType))       return new SpecialParisPepperoniPizza();
        else if(PizzaTypes.Sausage.name().equals(pizzaType))    return new SausagePizza();
        else if(PizzaTypes.Cheese.name().equals(pizzaType))     return new CheesePizza();
        else if(PizzaTypes.Veg.name().equals(pizzaType))        return new VegPizza();

        return null;
    }
}
