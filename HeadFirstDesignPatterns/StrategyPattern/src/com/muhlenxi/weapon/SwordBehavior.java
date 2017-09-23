package com.muhlenxi.weapon;

public class SwordBehavior implements  WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("用宝剑挥舞");
    }
}
