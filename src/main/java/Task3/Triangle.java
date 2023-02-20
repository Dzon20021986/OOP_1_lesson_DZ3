package Task3;

public class Triangle extends Shape{

    private String perimeter;


    public Triangle(String name, String perimeter) {
        super(name);
        this.perimeter = perimeter;
    }

    public void squareInfo() {
        System.out.println("Квадрат: " + name + "радиус: " + perimeter);
    }

}
