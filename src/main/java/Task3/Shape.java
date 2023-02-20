package Task3;

public class Shape {
    public String name;

    public Shape() {
    }

    public Shape(String name) {
        this.name = name;
    }

    public  void ShapeInfo() {
        System.out.println("Фигура: " + name);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
