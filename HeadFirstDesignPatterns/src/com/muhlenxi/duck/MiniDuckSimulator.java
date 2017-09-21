package com.muhlenxi.duck;

import com.muhlenxi.duck.FlyBehavior.FlyRocketPowered;

public class MiniDuckSimulator  {
    public static void main(String[] args) {
        MallardDuck  mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.swim();
        mallardDuck.display();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

        DuckCall duckCall = new DuckCall();
        duckCall.performQuack();
    }
}
