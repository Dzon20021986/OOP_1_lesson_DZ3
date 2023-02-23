package lesson3_Task1;

public class MyRunnablePong implements Runnable{
    private static final Object mon = new Object();
    private static volatile String Player2 = "Второй игрок отбил" + " Pong";


    @Override
    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Второй игрок отбил" + " Pong");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printPong() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 10; i++) {
                    while (Player2 != "pong") {
                        mon.wait();
                    }
                    System.out.println("pong");
                    Player2 = "ping";
                    mon.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
