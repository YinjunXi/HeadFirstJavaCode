package com.muhlenxi.duck;

import com.muhlenxi.duck.QuackBehavior.Quack;
import com.muhlenxi.duck.QuackBehavior.QuackBehavior;

public class DuckCall {
    QuackBehavior quackBehavior;

    public DuckCall() {
        quackBehavior = new Quack();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}








