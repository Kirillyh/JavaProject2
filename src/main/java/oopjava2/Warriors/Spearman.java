package oopjava2.Warriors;

import  oopjava2.BaseCharacter;

public class Spearman extends BaseCharacter implements Warrior{
    int resistance;

    public Spearman(String name, Integer x, Integer y) {
        super(1, name, 70, 60, 40, 40, true, x, y);
        //this.resistance = resistance;
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

    // @Override
    // public int getHealth() {
    //     // TODO Auto-generated method stub

    // }

    @Override
    public String toString() {
        return String.format("Class: %s  Name: %s", this.getClass().getSimpleName(), getName());

    }

}