package com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.paris;

import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.Pizza;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.PizzaIngredientFactory;

public class ParisPepperoniPizza extends Pizza {
    private PizzaIngredientFactory parisPizzaIngredientFactory;

    public ParisPepperoniPizza(PizzaIngredientFactory parisPizzaIngredientFactory) {
        this.pizzaName = "Paris Pepperoni";
        this.parisPizzaIngredientFactory = parisPizzaIngredientFactory;
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing " + pizzaName + " Pizza");
        System.out.println("Dough Type: " + parisPizzaIngredientFactory.createDough().getDoughType());
        System.out.println("Cheese Type: " + parisPizzaIngredientFactory.createCheese().getCheeseType());
        System.out.println("Pepperoni Type: " + parisPizzaIngredientFactory.createPepperoni().getPepperoniType());
    }
}
