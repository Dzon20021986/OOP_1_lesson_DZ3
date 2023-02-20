package Task2;

public class Lorry extends Car implements Moveable, Stopable {
    // class Lorry extends Car, Movable, Stopable написано не правильно так как
    //  класс Lorry наследуется от класса Car, и реализует  методы в интерфейсах Movable и Stopable

    Lorry(String engine, String color, String name) {
        super(engine, color, name);
    }

    @Override
    public void open() {
        System.out.println("Car is moving - Автомобиль движется");
    }

    @Override
    public void move() {
        System.out.println("car is stop - Автомобиль останавливается");
    }
}
