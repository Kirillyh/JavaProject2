package oopjava2.Warriors;

import oopjava2.BaseCharacter;

public interface Warrior {

    void attack (BaseCharacter target);

    void GetDamage(BaseCharacter target, int damage);

    void death(BaseCharacter target);

}