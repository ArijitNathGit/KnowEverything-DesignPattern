package com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.lisbon;

import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.Pizza;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.PizzaStore;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.PizzaIngredientFactory;
import com.tpp.demo.designpattern.abstractfactory.constants.PizzaTypes;

public class LisbonPizzaStore extends PizzaStore {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public LisbonPizzaStore() {
        this.pizzaIngredientFactory = new LisbonPizzaIngredientFactory();
    }
    
    @Override
    protected Pizza createPizza(String pizzaType) {
        if(PizzaTypes.Pepperoni.name().equals(pizzaType))       return new LisbonPepperoniPizza(pizzaIngredientFactory);
        else if(PizzaTypes.Sausage.name().equals(pizzaType))    return new LisbonSausagePizza(pizzaIngredientFactory);
        else if(PizzaTypes.Cheese.name().equals(pizzaType))     return new LisbonCheesePizza(pizzaIngredientFactory);
        else if(PizzaTypes.Veg.name().equals(pizzaType))        return new LisbonVegPizza(pizzaIngredientFactory);

        return null;
    }
}
