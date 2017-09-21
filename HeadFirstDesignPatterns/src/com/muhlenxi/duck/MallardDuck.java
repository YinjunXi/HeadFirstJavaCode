package com.muhlenxi.duck;

import com.muhlenxi.duck.FlyBehavior.FlyWithWings;
import com.muhlenxi.duck.QuackBehavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
