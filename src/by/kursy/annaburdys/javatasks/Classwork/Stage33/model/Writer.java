package by.kursy.annaburdys.javatasks.Classwork.Stage33.model;

public class Writer implements Runnable {
    private Thread thread;
    private String text;
    private Printer printer;

    public Writer(String text, Printer printer){
        thread = new Thread(this);
        this.text = text;
        this.printer = printer;
        thread.start();
    }

    public Thread getThread(){
        return thread;
    }

    @Override
    public void run() {
        synchronized (printer) {
            try {
                printer.print(text);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}