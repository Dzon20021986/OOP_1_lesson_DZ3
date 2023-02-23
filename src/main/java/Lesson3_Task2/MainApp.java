package Lesson3_Task2;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 15; i++) {
                counter.increment();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 15; i++) {
                counter.decrement();
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 15; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println(counter.getValue());
    }
}
