package oopjava2.Shooters;


import oopjava2.BaseCharacter;

public interface Shooter {

    void attack (BaseCharacter target);

    void GetDamage(BaseCharacter target, int damage);

    void death(BaseCharacter target);
}