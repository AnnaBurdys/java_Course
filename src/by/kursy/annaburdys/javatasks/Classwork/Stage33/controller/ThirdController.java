package by.kursy.annaburdys.javatasks.Classwork.Stage33.controller;

import by.kursy.annaburdys.javatasks.Classwork.Stage33.model.FourthThread;

import java.util.concurrent.TimeUnit;

public class ThirdController {
    public static void main(String[] args) throws InterruptedException {
        FourthThread thread = new FourthThread();

        TimeUnit.SECONDS.sleep(2);

       // thread.getThread().stop();
       // thread.getThread().interrupt(); - not working
        thread.getThread().suspend();

        TimeUnit.SECONDS.sleep(2);

        thread.getThread().resume();

        TimeUnit.SECONDS.sleep(2);
        thread.getThread().stop();

        System.out.println("Main thread finished");
    }
}
