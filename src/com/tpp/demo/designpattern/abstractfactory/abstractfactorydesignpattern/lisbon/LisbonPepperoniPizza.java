package com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.lisbon;

import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.Pizza;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.PizzaIngredientFactory;

public class LisbonPepperoniPizza extends Pizza {
    private PizzaIngredientFactory lisbonPizzaIngredientFactory;

    public LisbonPepperoniPizza(PizzaIngredientFactory lisbonPizzaIngredientFactory) {
        this.pizzaName = "Lisbon Pepperoni";
        this.lisbonPizzaIngredientFactory = lisbonPizzaIngredientFactory;
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing " + pizzaName + " Pizza");
        System.out.println("Dough Type: " + lisbonPizzaIngredientFactory.createDough().getDoughType());
        System.out.println("Cheese Type: " + lisbonPizzaIngredientFactory.createCheese().getCheeseType());
        System.out.println("Pepperoni Type: " + lisbonPizzaIngredientFactory.createPepperoni().getPepperoniType());
    }
}
