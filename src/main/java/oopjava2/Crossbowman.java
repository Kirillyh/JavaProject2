package oopjava2;

public class Crossbowman extends Pers{
    int amountOfbowns;
    int accuracy;

    public Crossbowman(int id, String name, int health, int stamina, String weapon, int amountOfbowns, int accuracy) {
        super(id, name, health, stamina, weapon);
        this.amountOfbowns = amountOfbowns;
        this.accuracy = accuracy;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, ", getClass(), name);
    }

    @Override
    protected void print() {
        super.print();
    }

}