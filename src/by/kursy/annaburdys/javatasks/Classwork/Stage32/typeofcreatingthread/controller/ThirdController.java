package by.kursy.annaburdys.javatasks.Classwork.Stage32.typeofcreatingthread.controller;

import by.kursy.annaburdys.javatasks.Classwork.Stage32.typeofcreatingthread.model.SecondThread;

public class ThirdController {
    public static void main(String[] args) {
        System.out.println("Main thread started");

        SecondThread threadFunction = new SecondThread();
        Thread thread1 = new Thread(threadFunction);
        Thread thread2 = new Thread(threadFunction);
        Thread thread3 = new Thread(threadFunction);

        thread1.start();
        thread2.start();
        thread3.start();

        while(true) {
            if (thread1.isAlive() == false && thread2.isAlive() == false && thread3.isAlive() == false) {
                break;
            }
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Main thread finished");
    }

}
