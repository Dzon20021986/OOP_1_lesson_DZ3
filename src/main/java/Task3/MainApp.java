package Task3;

public class MainApp {
    public static void main(String[] args) {
        Shape shape = new Shape("Круг");
        Circle circle = new Circle("круг","5 см");
        shape.ShapeInfo();
        circle.circleInfo();

    }
}
