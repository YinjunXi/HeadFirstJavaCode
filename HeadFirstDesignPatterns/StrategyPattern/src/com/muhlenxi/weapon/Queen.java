package com.muhlenxi.weapon;

public class Queen extends Character {
    @Override
    public void fight() {
        weaponBehavior = new KnifeBehavior();
        weaponBehavior.useWeapon();
    }
}
