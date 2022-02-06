package com.tpp.demo.designpattern.factory.whyfactoryisrequired;

import com.tpp.demo.designpattern.factory.constants.PizzaTypes;

public class PizzaStore {

    public void order(String pizzaType) {
        Pizza pizza = null;

        if(PizzaTypes.Pepperoni.name().equals(pizzaType))
            pizza = new PepperoniPizza();
        else if(PizzaTypes.Sausage.name().equals(pizzaType))
            pizza = new SausagePizza();
        else if(PizzaTypes.Cheese.name().equals(pizzaType))
            pizza = new CheesePizza();
        else if(PizzaTypes.Veg.name().equals(pizzaType))
            pizza = new VegPizza();


        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
