package com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.paris;

import com.tpp.demo.designpattern.abstractfactory.constants.PizzaTypes;
import com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.Pizza;
import com.tpp.demo.designpattern.abstractfactory.factorydesignpatternrecap.PizzaStore;

public class ParisPizzaStore extends PizzaStore {
    
    @Override
    protected Pizza createPizza(String pizzaType) {
        if(PizzaTypes.Pepperoni.name().equals(pizzaType))       return new ParisPepperoniPizza();
        else if(PizzaTypes.Sausage.name().equals(pizzaType))    return new ParisSausagePizza();
        else if(PizzaTypes.Cheese.name().equals(pizzaType))     return new ParisCheesePizza();
        else if(PizzaTypes.Veg.name().equals(pizzaType))        return new ParisVegPizza();

        return null;
    }
}
