package com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.london;

import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.*;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.PizzaIngredientFactory;
import com.tpp.demo.designpattern.abstractfactory.constants.PizzaTypes;

public class LondonPizzaStore extends PizzaStore {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public LondonPizzaStore() {
        this.pizzaIngredientFactory = new LondonPizzaIngredientFactory();
    }

    @Override
    protected Pizza createPizza(String pizzaType) {
        if(PizzaTypes.Pepperoni.name().equals(pizzaType))       return new LondonPepperoniPizza(pizzaIngredientFactory);
        else if(PizzaTypes.Sausage.name().equals(pizzaType))    return new LondonSausagePizza(pizzaIngredientFactory);
        else if(PizzaTypes.Cheese.name().equals(pizzaType))     return new LondonCheesePizza(pizzaIngredientFactory);
        else if(PizzaTypes.Veg.name().equals(pizzaType))        return new LondonVegPizza(pizzaIngredientFactory);

        return null;
    }
}
