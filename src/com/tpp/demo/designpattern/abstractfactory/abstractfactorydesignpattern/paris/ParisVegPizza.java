package com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.paris;

import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.Pizza;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.PizzaIngredientFactory;

public class ParisVegPizza extends Pizza {
    private PizzaIngredientFactory parisPizzaIngredientFactory;

    public ParisVegPizza(PizzaIngredientFactory parisPizzaIngredientFactory) {
        this.pizzaName = "Paris Veg";
        this.parisPizzaIngredientFactory = parisPizzaIngredientFactory;
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing " + pizzaName + " Pizza");
        System.out.println("Dough Type: " + parisPizzaIngredientFactory.createDough().getDoughType());
        System.out.println("Cheese Type: " + parisPizzaIngredientFactory.createCheese().getCheeseType());
    }
}
