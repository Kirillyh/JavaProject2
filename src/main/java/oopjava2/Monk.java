package oopjava2;

public class Monk extends Pers{
    int intellect;
    int mana;
    public Monk(int id, String name, int health, int stamina, String weapon, int intellect, int mana) {
        super(id, name, health, stamina, weapon);
        this.intellect = intellect;
        this.mana = mana;
    }
    @Override
    public String toString() {
        return String.format("%s, %s, ", getClass(), name);
    }

}
