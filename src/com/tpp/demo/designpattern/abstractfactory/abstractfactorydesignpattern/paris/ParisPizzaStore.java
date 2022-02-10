package com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.paris;

import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.PizzaStore;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.Pizza;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.PizzaIngredientFactory;
import com.tpp.demo.designpattern.abstractfactory.constants.PizzaTypes;

public class ParisPizzaStore extends PizzaStore {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public ParisPizzaStore() {
        this.pizzaIngredientFactory = new ParisPizzaIngredientFactory();
    }
    
    @Override
    protected Pizza createPizza(String pizzaType) {
        if(PizzaTypes.Pepperoni.name().equals(pizzaType))       return new ParisPepperoniPizza(pizzaIngredientFactory);
        else if(PizzaTypes.Sausage.name().equals(pizzaType))    return new ParisSausagePizza(pizzaIngredientFactory);
        else if(PizzaTypes.Cheese.name().equals(pizzaType))     return new ParisCheesePizza(pizzaIngredientFactory);
        else if(PizzaTypes.Veg.name().equals(pizzaType))        return new ParisVegPizza(pizzaIngredientFactory);

        return null;
    }
}
