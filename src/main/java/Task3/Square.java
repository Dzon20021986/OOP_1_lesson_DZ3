package Task3;

public class Square extends Shape{
    private String length;


    public Square(String name, String length) {
        super(name);
        this.length = length;
    }

    public void squareInfo() {
        System.out.println("Квадрат: " + name + "радиус: " + length);
    }
}
