package lesson3_Task1;

public class MainApp {




    public static void main(String[] args)  {

        Thread ping = new Thread(new MyRunnablePing());
        Thread pong = new Thread(new MyRunnablePong());

        System.out.println(" Начало игры!!!");
        System.out.println("===========================================================");
        ping.start();
        pong.start();














    }
}
