package com.muhlenxi.coffee;

public abstract class Beverage {
    public String description = "Unknow Beverage";

    public String getDescription() {
        return description;
    }

    public  abstract double cost();

}
