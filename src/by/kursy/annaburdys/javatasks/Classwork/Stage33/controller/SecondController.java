package by.kursy.annaburdys.javatasks.Classwork.Stage33.controller;

import by.kursy.annaburdys.javatasks.Classwork.Stage33.model.FourthThread;

public class SecondController {
    public static void main(String[] args) throws InterruptedException {
        int count = 5;
        FourthThread[] threads = new FourthThread[count];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new FourthThread();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].getThread().join();
        }

    }
}