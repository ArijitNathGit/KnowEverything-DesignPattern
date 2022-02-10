package com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.london;

import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.PizzaIngredientFactory;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.cheese.Cheese;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.cheese.MozzarellaCheese;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.dough.Dough;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.dough.ThinCrustDough;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.pepperoni.Pepperoni;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.pepperoni.TurkeyPepperoni;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.sausage.ChickenSausage;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.sausage.Sausage;

public class LondonPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Sausage createSausage() {
        return new ChickenSausage();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new TurkeyPepperoni();
    }
}
