package by.kursy.annaburdys.javatasks.Classwork.Stage32.typeofcreatingthread.model;

public class DeamonThread implements Runnable{
    public void run() {
        boolean isDaemon = Thread.currentThread().isAlive();
        String name = Thread.currentThread().getName();
        long id = Thread.currentThread().getId();
        /*while (true) {
            System.out.printf("message from %d %s thread \n", id, name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }*/

        for (int i = 0; i < 50; i++) {
            System.out.printf("message from %d daemon %s thread \n", id, name);
            System.out.printf("Is daemon - %b \n", isDaemon);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
