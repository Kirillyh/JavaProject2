package oopjava2;

public class Sniper extends Pers {
    int accuracy;
    int disguise;
    public Sniper(int id, String name, int health, int stamina, String weapon, int accuracy, int disguise) {
        super(id, name, health, stamina, weapon);
        this.accuracy = accuracy;
        this.disguise = disguise;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, ", getClass(), name);
    }

}