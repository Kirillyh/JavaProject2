package oopjava2;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;


public abstract class BaseCharacter {

    protected static Random r;

    protected int level;
    protected String name;
    protected int health;
    protected int strength;
    protected int agility;
    protected int stamina;
    protected Boolean status;

    protected Position position;

    public BaseCharacter(int level, String name, int health, int strength, int agility, int stamina, Boolean status, Integer x, Integer y) {
        this.level = 1;
        this.name = name;
        this.health = 50;
        this.strength = 30;
        this.agility = 20;
        this.stamina = 30;
        this.status = true;
        this.position = new Position(x, y);
    }

    public String getName(){
        String str = new String(this.name);
        return str;
    }

    public int getStamina() {
        return stamina;
    }

    public Boolean getStatus() {
        return status;
    }

    public void print() {
        System.out.println("Уровень: " + level + " Имя: " + name);
    }

    public void GetDamage(int damage) {
        if (this.health - damage > 0) {
            this.health -= damage;
        }
    }

    public void death(BaseCharacter target){
        if (target.getHealth() < 1) {
            System.out.println("Ваш персонаж мертв");
        }
    }

    public int getHealth() {
        return health;
    }
    /**
     * @return Этот метод сообщает Имя, Уровень здоровья, Координаты и Статус персонажа
     */
    public String getInfo() {
        String resStr = new String(this.getName() + this.getHealth() + this.position.getPosition() + this.getStatus());
        return resStr;
    }

    public BaseCharacter nearestEnemy (List<BaseCharacter> targets) {
        Queue<BaseCharacter> target = new LinkedList<>();
        double minDistance = 8;
        for (BaseCharacter hero : targets) {
            if (position.getDistanse(hero) < minDistance) {
                minDistance = position.getDistanse(hero);
                target.add(hero);
            }
        }
        return target.remove();
    }

}