package lesson3_Task1;

public class MyRunnablePong implements Runnable{
    private static final Object mon = new Object();
//    private volatile String currentLine1 = "Первый игрок отбил" + " Ping";
    private static volatile String currentLine2 = "Второй игрок отбил" + " Pong";


    @Override
    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Второй игрок отбил" + " Pong");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printPong() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 10; i++) {
                    while (currentLine2 != "pong") {   // было pong
                        mon.wait();
                    }
                    System.out.println("pong");      // было pong
                    currentLine2 = "ping";           // было ping
                    mon.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
