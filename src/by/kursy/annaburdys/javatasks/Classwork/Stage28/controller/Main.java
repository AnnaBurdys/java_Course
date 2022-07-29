package by.kursy.annaburdys.javatasks.Classwork.Stage28.controller;

import by.kursy.annaburdys.javatasks.Classwork.Stage28.model.BinaryWorker;
import by.kursy.annaburdys.javatasks.Classwork.Stage28.model.CharWorker;

public class Main {
    public static void main(String[] args) {
        String fileName = "/Users/annaburdys/Desktop/test.bin";
        BinaryWorker.write(fileName);
        System.out.println(BinaryWorker.read(fileName));

        fileName = "/Users/annaburdys/Desktop/text.rtf";
        CharWorker.write(fileName);
        System.out.println(CharWorker.read(fileName));
    }
}