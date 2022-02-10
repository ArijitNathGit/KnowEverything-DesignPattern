package com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.lisbon;

import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.Pizza;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.PizzaIngredientFactory;

public class LisbonCheesePizza extends Pizza {
    private PizzaIngredientFactory lisbonPizzaIngredientFactory;

    public LisbonCheesePizza(PizzaIngredientFactory lisbonPizzaIngredientFactory) {
        this.pizzaName = "Lisbon Cheese";
        this.lisbonPizzaIngredientFactory = lisbonPizzaIngredientFactory;
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing " + pizzaName + " Pizza");
        System.out.println("Dough Type: " + lisbonPizzaIngredientFactory.createDough().getDoughType());
        System.out.println("Cheese Type: " + lisbonPizzaIngredientFactory.createCheese().getCheeseType());
    }
}
