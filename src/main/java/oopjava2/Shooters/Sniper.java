package oopjava2.Shooters;

import oopjava2.BaseCharacter;

public class Sniper extends BaseCharacter implements Shooter {
    int bullets;

    public Sniper(String name, Integer x, Integer y) {
        super(1, name, 60, 50, 40, 20, true, x, y);
        this.bullets = bullets;
    }

    @Override
    public void death(BaseCharacter target) {
        // TODO Auto-generated method stub
        super.death(target);
    }

    @Override
    public void GetDamage(BaseCharacter target, int damage) {
        // TODO Auto-generated method stub

    }

    @Override
    public void attack(BaseCharacter target) {
        // TODO Auto-generated method stub

    }

    @Override
    public String toString() {
        return String.format("Class: %s  Name: %s", this.getClass().getSimpleName(), getName());
    }

}