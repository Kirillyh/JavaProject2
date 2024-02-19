package oopjava2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


import oopjava2.Megicains.Monk;
import oopjava2.Megicains.Wizard;
import oopjava2.Shooters.Crossbowman;
import oopjava2.Shooters.Sniper;
import oopjava2.Warriors.Peasant;
import oopjava2.Warriors.Raider;
import oopjava2.Warriors.Spearman;

/*
Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах".
Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд).
Создать абстрактный класс и иерархию наследников.
 */

/*Крестьянин:      Разбойник:              Копейщик:
 - Здоровье        - ID                    - ID
 - Сила            - Имя                   - Имя
 - Ловкость        - Здоровье              - Здоровье
 - Выносливость    - Сила                  - Сила
 - Вид оружия      - Ловкость              - Выносливость
 - Уровень         - Выносливость          - Вид оружия
 - ID              - Вид оружиня           - Защита
 - Имя

 Снайпер           Арбалетчик:             Колдун:             Монах:
 - ID              - ID                    - ID                - ID
 - Имя             - Имя                   - Имя               - Имя
 - Здоровье        - Здоровье              - Здоровье          - Здоровье
 - Сила            - Выносливость          - Интеллект         - Выносливость
 - Ловкость        - Вид оружия            - Выносливость      - Вид оружия
 - Выносливость    - Меткость              - Вид оружия        - Интеллект
 - Вид оружия      - Количество стрел      - Мана              - Вера
 - Меткость        - Скорость стрельбы                         - Чакра
 - Маскировка


*/
public class Main {
    public static void main(String[] args) {

        Sniper sniper = new Sniper(fillName(), 0, 0);
        Crossbowman crossbowman = new Crossbowman(fillName(), 0, 0);
        Wizard magic = new Wizard(fillName(), 0, 0);
        Peasant peasant = new Peasant(fillName(), 0, 0);
        Spearman spearman = new Spearman(fillName(), 0, 0);
        Monk monk = new Monk(fillName(), 0, 0);
        Raider raider = new Raider(fillName(), 0, 0);

        // System.out.printf("Name: %s %s\n",sniper.name, sniper.toString());
        // System.out.printf("Name: %s %s\n",crossbowman.name, crossbowman.toString());
        // System.out.printf("Name: %s %s\n",magic.name, magic.toString());
        // System.out.printf("Name: %s %s\n",monk.name, monk.toString());
        // System.out.printf("Name: %s %s\n",spearman.name, spearman.toString());
        // System.out.printf("Name: %s %s\n",raider.name, raider.toString());
        // System.out.printf("Name: %s %s\n",peasant.name, peasant.toString());

        int teamCount = 10;
        List<BaseCharacter> team1 = new ArrayList<>();
        List<BaseCharacter> team2 = new ArrayList<>();

        for (int i = 0; i < teamCount; i++) {
            switch (new Random().nextInt(1, 8)) {
                case 1:
                    team1.add(new Monk(fillName(), i, 0));
                    break;
                case 2:
                    team1.add(new Wizard(fillName(), i, 0));
                    break;
                case 3:
                    team1.add(new Crossbowman(fillName(), i, 0));
                    break;
                case 4:
                    team1.add(new Sniper(fillName(), i, 0));
                    break;
                case 5:
                    team1.add(new Peasant(fillName(), i, 0));
                    break;
                case 6:
                    team1.add(new Raider(fillName(), i, 0));
                    break;
                case 7:
                    team1.add(new Spearman(fillName(), i, 0));
                    break;
            }
        }

        for (int i = 0; i < teamCount; i++) {
            switch (new Random().nextInt(1, 8)) {
                case 1:
                    team2.add(new Monk(fillName(), i, 9));
                    break;
                case 2:
                    team2.add(new Wizard(fillName(), i, 9));
                    break;
                case 3:
                    team2.add(new Crossbowman(fillName(), i, 9));
                    break;
                case 4:
                    team2.add(new Sniper(fillName(), i, 9));
                    break;
                case 5:
                    team2.add(new Peasant(fillName(), i, 5));
                    break;
                case 6:
                    team2.add(new Raider(fillName(), i, 9));
                    break;
                case 7:
                    team2.add(new Spearman(fillName(), i, 9));
                    break;
            }
        }
        /*
         * #Сделал еще один вариант алгоритма распределения по командам
         */
        // for (int i = 0; i < teamCount; i++) {

        //     switch (new Random().nextInt(4)) {
        //         case 0:
        //             team1.add(new Monk(fillName(), i, 0));
        //             team2.add(new Wizard(fillName(), i, 9));
        //             break;
        //         case 1:
        //             team1.add(new Crossbowman(fillName(), i, 0));
        //             team2.add(new Sniper(fillName(), i, 9));
        //             break;
        //         case 2:
        //             team1.add(new Raider(fillName(), i, 0));
        //             team2.add(new Spearman(fillName(), i, 9));
        //             break;
        //         case 3:
        //             team1.add(new Peasant(fillName(), i, 0));
        //             team2.add(new Peasant(fillName(), i, 9));
        //             break;
        //     }
        // }
        for (BaseCharacter unit : team1) {
            System.out.printf("Имя: %s, Класс: %s, Координаты: %d,%d\n", unit.getName(), unit.getClass().getSimpleName(), unit.position.getX(), unit.position.getY());
        }
        System.out.println();
        for (BaseCharacter unit : team2) {
            System.out.printf("Имя: %s, Класс: %s, Координаты: %d,%d\n", unit.getName(), unit.getClass().getSimpleName(), unit.position.getX(), unit.position.getY());
        }
        // Проба метода getInfo
        System.out.println(team1.get(0).getInfo());
        System.out.println("------------------");

        // визуально видно, что персонаж из второй команды, который стоит не на 9 клетке а на 5, определяется как цель
        System.out.println(team1.get(2).nearestEnemy(team2));
    }

    private static String fillName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }
}