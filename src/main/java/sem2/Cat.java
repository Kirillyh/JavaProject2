package sem2;

public abstract class Cat extends Animal{
    public static int countCat;
    public static final int canRun = 200;
    public static final int canSwim = 0;
    public Cat(String name) {
        super(name);
        countCat++;
    }

    @Override
    public abstract void swim(int distance);
//        System.out.println("Коты не плавают");



    @Override
    public abstract void run(int distance);
//        if(distance > canRun){
//            System.out.println(name + "Не пробежал");
//        } else System.out.println(name + " пробежал " + distance);

}