package com.muhlenxi.coffee.condiment;

import com.muhlenxi.coffee.Beverage;

// 装饰者 抽象类 调料基类
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
