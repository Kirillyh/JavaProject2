package oopjava2.Megicains;

import  oopjava2.BaseCharacter;
    public class Wizard extends BaseCharacter implements Magican {
        int mana;

        public Wizard(String name,Integer x, Integer y) {
            super(1, name, 50, 30, 20, 20, true, x, y);
            //this.mana = mana;
        }

        @Override
        public void attack(BaseCharacter target) {
            // TODO Auto-generated method stub
            attack(target);
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
