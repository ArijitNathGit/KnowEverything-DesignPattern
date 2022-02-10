package com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.lisbon;

import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.PizzaIngredientFactory;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.cheese.CheddarCheese;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.cheese.Cheese;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.cheese.MozzarellaCheese;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.dough.Dough;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.dough.ThinCrustDough;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.pepperoni.CubedPepperoni;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.pepperoni.Pepperoni;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.pepperoni.TurkeyPepperoni;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.sausage.ChickenSausage;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.sausage.ItalianSausage;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.sausage.Sausage;

public class LisbonPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Sausage createSausage() {
        return new ItalianSausage();
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
