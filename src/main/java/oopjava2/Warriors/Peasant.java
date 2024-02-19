package oopjava2.Warriors;

import oopjava2.BaseCharacter;

public class Peasant extends BaseCharacter implements Warrior {
    int unity;

    public Peasant(String name, Integer x, Integer y) {
        super(1, name, 70, 60, 40, 40, true, x, y);
        //this.unity = unity;
    }

    @Override
    public void attack(BaseCharacter target){
        int damage = BaseCharacter.r.nextInt(1, 5);
        target.GetDamage(damage);
    }

    public void work(int hour) {
        stamina -= hour / 4;
    }

    @Override
    public void GetDamage(BaseCharacter target, int damage) {
        // TODO Auto-generated method stub

    }

    @Override
    public void death(BaseCharacter target) {
        // TODO Auto-generated method stub
        super.death(target);
    }

    @Override
    public String toString() {
        return String.format("Class: %s  Name: %s", this.getClass().getSimpleName(), getName());

    }


}