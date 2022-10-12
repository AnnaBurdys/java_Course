package by.kursy.annaburdys.javatasks.Homework.Stage32.model;

import by.kursy.annaburdys.javatasks.Homework.Stage32.controller.Printer;

public class Thread1 extends Thread {
    Printer t;

    public Thread1(Printer t) {
        this.t = t;
    }

    public void run() {
        while (t.text != null) {
            Printer.printTable(t.text);
        }
    }
}
