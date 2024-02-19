package oopjava2.Warriors;

import  oopjava2.BaseCharacter;

public class Raider extends BaseCharacter implements Warrior {
    int fortune;

    public Raider(String name, Integer x, Integer y) {
        super(1, name, 70, 60, 40, 40, true, x, y);
        //this.fortune = fortune;
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