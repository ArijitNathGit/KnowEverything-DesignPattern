package com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients;

import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.cheese.Cheese;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.dough.Dough;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.pepperoni.Pepperoni;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.sausage.Sausage;

public interface PizzaIngredientFactory {
    Sausage createSausage();
    Dough createDough();
    Cheese createCheese();
    Pepperoni createPepperoni();
}
