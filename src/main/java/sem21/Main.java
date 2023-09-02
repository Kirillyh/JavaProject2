package sem21;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Human human = new Human();
        human.start(car);
        human.start(car);
        human.finish(car);
        human.finish(car);
        human.start(car);
        Scate scate = new Scate();
        human.start(scate);
        human.finish(scate);
    }
}