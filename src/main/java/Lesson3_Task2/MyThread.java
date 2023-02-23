package Lesson3_Task2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread implements Runnable {
    final Lock lock = new ReentrantLock();
    final Condition notFree = lock.newCondition();
    final Condition notBusy = lock.newCondition();

    private static final Object mon = new Object();
    private int value;


    public int getValue() {
        return value;
    }

    public void increment() {
        value++;
    }

    public void print(Thread thread) throws InterruptedException {
        lock.lock();
        try {


        }finally {
            lock.lock();
        }

    }

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("Поток" + value);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
