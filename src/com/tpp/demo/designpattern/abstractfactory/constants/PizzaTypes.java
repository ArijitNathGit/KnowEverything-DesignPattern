package com.tpp.demo.designpattern.abstractfactory.constants;

public enum PizzaTypes {
    Cheese("Cheese"),
    Pepperoni("Pepperoni"),
    Sausage("Sausage"),
    Veg("Veg");

    private String type;
    PizzaTypes(String type) {
        this.type = type;
    }
}
