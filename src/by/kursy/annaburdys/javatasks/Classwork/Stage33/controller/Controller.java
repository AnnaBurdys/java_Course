package by.kursy.annaburdys.javatasks.Classwork.Stage33.controller;

import by.kursy.annaburdys.javatasks.Classwork.Stage33.model.Printer;
import by.kursy.annaburdys.javatasks.Classwork.Stage33.model.Writer;

public class Controller {
    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();


        int count = 5;
        Writer[] writers = new Writer[count];
        String[] texts = {"first", "second", "third", "fourth", "fifth"};

        for (int i = 0; i < writers.length; i++) {
            writers[i] = new Writer(texts[i], printer);
        }

        for (int i = 0; i < writers.length; i++) {
            writers[i].getThread().join();
        }

    }
}