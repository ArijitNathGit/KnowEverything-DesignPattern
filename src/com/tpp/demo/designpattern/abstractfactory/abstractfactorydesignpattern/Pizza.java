package com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern;

import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.cheese.Cheese;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.dough.Dough;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.pepperoni.Pepperoni;
import com.tpp.demo.designpattern.abstractfactory.abstractfactorydesignpattern.ingredients.sausage.Sausage;

public abstract class Pizza {
    protected String pizzaName;

    protected Dough dough;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Sausage sausage;

    protected abstract void prepare();
    protected void bake() {
        System.out.println("Baking " + pizzaName +" Pizza");
    }
    protected void cut() {
        System.out.println("Cutting " + pizzaName +" Pizza");
    }
    protected void box() {
        System.out.println("Boxing " + pizzaName +" Pizza");
    }
}
