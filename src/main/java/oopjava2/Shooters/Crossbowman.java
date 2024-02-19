package oopjava2.Shooters;

import java.util.List;

import  oopjava2.BaseCharacter;

public class Crossbowman extends BaseCharacter implements Shooter{
    int arrows;

    public Crossbowman(String name, Integer x, Integer y) {
        super(1, name, 60, 50, 40, 20, true, x, y);
        //this.arrows = arrows;
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

    @Override
    public BaseCharacter nearestEnemy(List<BaseCharacter> targets) {
        // TODO Auto-generated method stub
        return null;
    }


}