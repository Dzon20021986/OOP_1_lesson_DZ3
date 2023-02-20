package Task2;

public abstract class Car {
    public String engine;  // public Engine engine тип переменной должен стоять String а модификатор private
    public String color;
    public String name;

    public Car(String engine, String color, String name) {  // добавил конструктор
        this.engine = engine;
        this.color = color;
        this.name = name;
    }

    protected  void start() {
        System.out.println("Car starting - Автомобиль заводится");  // Запуск Автомобиля
    }

      abstract void open();


    public String getEngine() {   // public Engine getEngine тип переменной должен стоять String
        return engine;
    }

    public void setEngine (String engine) {  // Engine engine должен стоять тип переменной.
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {   // void ничего не возвращает из за этого выдает ошибку должен стоять тип переменой String
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
