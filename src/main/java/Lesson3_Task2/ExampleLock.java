package Lesson3_Task2;

public class ExampleLock {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();
    private static final Object lock3 = new Object();

    public static void main(String[] args) {

    }

    private static class ThreadOne extends Thread {
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread1 захватил Lock1");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread  ожидает Lock2");
                synchronized (lock2) {
                    System.out.println();
                }
            }
        }
    }

}
