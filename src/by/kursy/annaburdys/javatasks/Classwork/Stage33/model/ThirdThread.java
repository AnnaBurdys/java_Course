package by.kursy.annaburdys.javatasks.Classwork.Stage33.model;

import java.util.concurrent.TimeUnit;

public class ThirdThread extends Thread {

    public ThirdThread() {
        start();
    }

    @Override
    public void run() {
        String name = getName();
        while (true) {
            System.out.printf("Child thread %s is running....\n", name);

            try {
                //   Thread.sleep(400);
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }
}
