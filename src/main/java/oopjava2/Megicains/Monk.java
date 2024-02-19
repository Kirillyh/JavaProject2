package oopjava2.Megicains;

import oopjava2.BaseCharacter;

public class Monk extends BaseCharacter implements Magican {
    int faith;

    public Monk(String name,Integer x, Integer y) {
        super(1, name, 50, 30, 20, 20, true, x, y);
        //this.faith = faith;
    }

    @Override
    public void GetDamage(BaseCharacter target, int damage) {
        if (target.getHealth() - damage > 0) {
            health -=damage;
        } else {
            super.death(target);
        }
    }

    @Override
    public void death(BaseCharacter target) {
        // TODO Auto-generated method stub
        super.death(target);
    }

    @Override
    public void attack(BaseCharacter target) {
        // TODO Auto-generated method stub

    }

    public void healing(BaseCharacter target) {
        // TODO Auto-generated method stub

    }

    @Override
    public String toString() {
        return String.format("Class: %s  Name: %s", this.getClass().getSimpleName(), getName());

    }




}