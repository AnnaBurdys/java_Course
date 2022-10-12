package by.kursy.annaburdys.javatasks.Classwork.Stage32.typeofcreatingthread.controller;

import by.kursy.annaburdys.javatasks.Classwork.Stage32.typeofcreatingthread.model.FirstThread;

public class FirstController {
    public static void main(String[] args) throws InterruptedException {
        FirstThread thread = new FirstThread();
    thread.start();

    Thread mainThread = new FirstThread();
    String name = mainThread.getName();
    long id = mainThread.getId();
        while(true) {
            System.out.printf("message from %d %s thread \n", id, name);
            Thread.sleep(500);
        }

    }
}
