package com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.paris;

import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.PizzaIngredientFactory;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.cheese.CheddarCheese;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.cheese.Cheese;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.cheese.MozzarellaCheese;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.dough.Dough;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.dough.ParisSpecialDough;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.dough.ThinCrustDough;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.pepperoni.CubedPepperoni;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.pepperoni.Pepperoni;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.pepperoni.TurkeyPepperoni;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.sausage.ChickenSausage;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.sausage.ItalianSausage;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.sausage.Sausage;

public class ParisPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Sausage createSausage() {
        return new ItalianSausage();
    }

    @Override
    public Dough createDough() {
        return new ParisSpecialDough();
    }

    @Override
    public Cheese createCheese() {
        return new CheddarCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new CubedPepperoni();
    }
}
