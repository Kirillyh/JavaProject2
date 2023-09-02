package sem2;

public class Tiger extends Cat{
    public static final int canRun  = 400;
    public static final int canTigerSwim = 100;

    public Tiger(String name) {
        super(name);

    }

    @Override
    public void swim(int distance) {
        if(distance > canTigerSwim){
            System.out.println(name + "Не проплыл");
        } else System.out.println(name + " Проплыл " + distance);
    }

    @Override
    public void run(int distance) {
        if(distance > canRun){
            System.out.println(name + "Не пробежал");
        } else System.out.println(name + " пробежал " + distance);
    }
}