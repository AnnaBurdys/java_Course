package by.kursy.annaburdys.javatasks.Classwork.Stage33.controller;

import by.kursy.annaburdys.javatasks.Classwork.Stage33.model.ThirdThread;

import java.util.concurrent.TimeUnit;

public class FirstController {
    public static void main(String[] args) {
       ThirdThread thread = new ThirdThread();
       thread.setPriority(2);

       Thread main = Thread.currentThread();
       main.setPriority(Thread.MIN_PRIORITY);

        while (true) {
            System.out.println("Main thread is running....");

            try {
                //   Thread.sleep(400);
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}