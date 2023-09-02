package sem21;

public class Human {
    private Car lastCar;
    private Scate lastScate;

    public void start(Car car) {
        if (lastCar == null) {
            car.run();
            lastCar = car;
        } else {
            System.out.println("уже передвигаемся");
        }
    }

    public void finish(Car car) {
        if (lastCar != null) {
            car.stop();
            lastCar = null;
        } else {
            System.out.println("уже стоим");
        }
    }

    public void start(Scate car) {
        if (lastScate == null) {
            car.run();
            lastScate = car;
        } else {
            System.out.println("уже передвигаемся");
        }
    }

    public void finish(Scate car) {
        if (lastScate != null) {
            car.stop();
            lastScate = null;
        } else {
            System.out.println("уже стоим");
        }
    }
}