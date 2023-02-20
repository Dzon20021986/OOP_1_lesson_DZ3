package Task3;

public class Circle extends Shape{
   private String radius;


    public Circle(String name, String radius) {
        super(name);
        this.radius = radius;
    }

    public void circleInfo() {
        System.out.println("Круг: " + name + "радиус: " + radius);
    }

}
