package by.kursy.annaburdys.javatasks.Homework.Stage32;

import by.kursy.annaburdys.javatasks.Homework.Stage32.controller.Printer;
import by.kursy.annaburdys.javatasks.Homework.Stage32.model.Thread1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String text = scanner.nextLine();

        Printer obj = new Printer();
        Thread1 t1=new Thread1(obj);

        Printer.printTable(text);
        t1.start();

    }
}
