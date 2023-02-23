package lesson3_Task1;

public class MyRunnablePing implements Runnable{
    private static final Object mon = new Object();
    private static volatile String Player1 = "Первый игрок отбил" + " Ping";


    @Override
    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Первый игрок отбил" + " Ping");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printPing() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 10; i++) {
                    while (Player1 != "ping") {
                        mon.wait();
                    }
                    System.out.println("ping");
                    Player1 = "pong";
                    mon.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
