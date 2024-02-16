package oopjava2;

public class Sorcerer extends Pers {
    int intellect;
    int mana;
    public Sorcerer(int id, String name, int health, int stamina, String weapon, int intellect, int mana) {
        super(id, name, health, stamina, weapon);
        this.intellect = intellect;
        this.mana = mana;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, ", getClass(), name);
    }
}
// Класс Magic наследует класс Pers и добавляет два новых поля: intellect (интеллект) и mana (мана).
// В конструкторе устанавливаются все поля, включая новые поля intellect и mana, с помощью вызова конструктора родительского класса.
// Метод toString переопределен для возврата информации о классе Magic, а также имени персонажа в определенном формате.