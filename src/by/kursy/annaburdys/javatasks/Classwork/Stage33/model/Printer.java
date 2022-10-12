package by.kursy.annaburdys.javatasks.Classwork.Stage33.model;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Printer {

    private Lock lock;

    public Printer() {
        lock = new ReentrantLock();
    }

    public void print(String text) throws InterruptedException {
        lock.lock();

        System.out.print("[");

        try {

            TimeUnit.MILLISECONDS.sleep(100);

            try {
                for (int i = 0; i < text.length(); i++) {
                    System.out.print(text.charAt(i));
                    TimeUnit.MILLISECONDS.sleep(100);
                }

                TimeUnit.MILLISECONDS.sleep(100);
            } finally {
                lock.unlock();
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("]");
    }
}