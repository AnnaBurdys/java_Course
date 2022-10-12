package by.kursy.annaburdys.javatasks.Classwork.Stage32.typeofcreatingthread.controller;

import by.kursy.annaburdys.javatasks.Classwork.Stage32.typeofcreatingthread.model.SecondThread;

public class FourthController {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started");

        int count = 5;

        SecondThread threadFunction = new SecondThread();
        Thread[] threads = new Thread[count];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(threadFunction);
            threads[i].start();
        }

        try {
            for (int i = 0; i < threads.length; i++) {
                threads[i].join();
            }
        } catch (InterruptedException exception) {
            System.out.println(exception);
        }


        System.out.println("Main thread finished");
    }
}