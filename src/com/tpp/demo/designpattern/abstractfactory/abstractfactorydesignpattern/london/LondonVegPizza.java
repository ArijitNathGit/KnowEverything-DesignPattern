package com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.london;

import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.Pizza;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.PizzaIngredientFactory;

public class LondonVegPizza extends Pizza {
    private PizzaIngredientFactory londonPizzaIngredientFactory;

    public LondonVegPizza(PizzaIngredientFactory londonPizzaIngredientFactory) {
        this.pizzaName = "London Veg";
        this.londonPizzaIngredientFactory = londonPizzaIngredientFactory;
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing " + pizzaName + " Pizza");
        System.out.println("Dough Type: " + londonPizzaIngredientFactory.createDough().getDoughType());
        System.out.println("Cheese Type: " + londonPizzaIngredientFactory.createCheese().getCheeseType());
    }
}
