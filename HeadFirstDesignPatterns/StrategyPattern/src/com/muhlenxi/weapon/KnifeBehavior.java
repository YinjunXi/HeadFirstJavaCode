package com.muhlenxi.weapon;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("用匕首刺杀");
    }
}
