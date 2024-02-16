package oopjava2;

public class Robber extends Pers {
    int Endurance;
    int Dexterity;

    public Robber(int id, String name, int health, int stamina, String weapon, int Endurance,int Dexterity) {
        super(id, name, health, stamina, weapon);
        this.Endurance = Endurance;
        this.Dexterity = Dexterity;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, ", getClass(), name);
    }

    @Override
    protected void attack(Pers target) {
        int damage = Pers.r.nextInt(1, 5) * Endurance * Dexterity;
    }
    public void karma(int robbery) {
        name += robbery + 2;
    }
}