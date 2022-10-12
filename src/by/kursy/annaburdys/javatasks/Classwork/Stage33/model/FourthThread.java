package by.kursy.annaburdys.javatasks.Classwork.Stage33.model;

import java.util.concurrent.TimeUnit;

public class FourthThread implements Runnable {
    private Thread thread;
    private boolean running;

    public FourthThread() {
        thread = new Thread(this);
        thread.start();
    }

    public Thread getThread() {
        return thread;
    }

    public void stop() {
        running = false;
    }

    @Override
    public void run() {
        String name = thread.getName();


        while (running) {
            System.out.printf("Child thread %s is running....\n", name);

            try {
                //   Thread.sleep(400);
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.printf("Child thread %s finished", name);
    }
}
