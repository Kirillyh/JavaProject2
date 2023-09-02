package sem2;



public class HomeCate extends Cat {
    public static int countHomeCat ;


    public HomeCate(String name) {
        super(name);
        countHomeCat++;

    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не плавают");

    }

    @Override
    public void run(int distance) {
        if(distance > canRun){
            System.out.println(name + "Не пробежал");
        } else System.out.println(name + " пробежал " + distance);
    }
}