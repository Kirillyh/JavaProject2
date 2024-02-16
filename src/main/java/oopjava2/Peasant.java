package oopjava2;

public class Peasant extends Pers {
    int strength;
    int agility;

    public Peasant(int id, String name, int health, int stamina, String weapon, int strength, int agility) {
        super(id, name, health, stamina, weapon);
        this.strength = strength;
        this.agility = agility;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, ", getClass(), name);
    }

    @Override
    public void attack(Pers target){
        int damage = Pers.r.nextInt(1, 5) * strength * agility;
        target.GetDamage(damage);
    }

    public void work(int hour) {
        stamina -= hour / 4;
    }
    /*
    Класс Peasant расширяет класс Pers и добавляет два новых поля strength и agility.
     Конструктор класса Peasant принимает эти поля в качестве аргументов,
     вызывает конструктор суперкласса и инициализирует новые поля.
     Метод toString переопределен для возврата форматированной строки с названием класса и именем.
     Метод attack переопределен для нанесения урона цели на основе силы и ловкости.
     Метод work уменьшает выносливость персонажа в зависимости от числа переданных часов работы.
     */

}