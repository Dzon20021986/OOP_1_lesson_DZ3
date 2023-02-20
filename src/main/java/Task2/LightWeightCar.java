package Task2;

public class LightWeightCar extends Car implements Moveable { // Легкий автомобиль


    private LightWeightCar(String engine, String color, String name) {
        super(engine, color, name);
    }


    @Override
    public void open() {
        System.out.println("Car is open");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
