package Task2;

public class Main {
    public static void main(String[] args) {
        Lorry lorry = new Lorry("1.5", "красный", "нива");
        lorry.start();
        lorry.open();
        lorry.move();
        System.out.println(lorry.toString());

    }
}
