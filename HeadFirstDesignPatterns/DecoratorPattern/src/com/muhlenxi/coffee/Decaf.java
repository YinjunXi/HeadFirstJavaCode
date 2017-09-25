package com.muhlenxi.coffee;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
