package lesson3_Task1;

public class MyRunnablePing implements Runnable{
    private static final Object mon = new Object();
    private static volatile String currentLine1 = "Первый игрок отбил" + " Ping";
//    private volatile String currentLine2 = "Второй игрок отбил" + " Pong";


    @Override
    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Первый игрок отбил" + " Ping");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printPing() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 10; i++) {
                    while (currentLine1 != "ping") {  //  было ping
                        mon.wait();
                    }
                    System.out.println("ping");      //  было  ping
                    currentLine1 = "pong";           // было  pong 1
                    mon.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
