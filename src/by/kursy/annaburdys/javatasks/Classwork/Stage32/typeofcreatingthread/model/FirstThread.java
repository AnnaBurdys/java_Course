package by.kursy.annaburdys.javatasks.Classwork.Stage32.typeofcreatingthread.model;

public class FirstThread extends Thread {
    @Override
    public void run() {
        String name = getName();
        long id = Thread.currentThread().getId();
        while(true) {
            System.out.printf("message from %d %s thread \n", id, name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
