package by.kursy.annaburdys.javatasks.Classwork.Stage11.Task02.controller;

import by.kursy.annaburdys.javatasks.Classwork.Stage11.Task02.model.Manager;
import by.kursy.annaburdys.javatasks.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input marks\n ");
            int mark1 = scanner.nextInt();
            int mark2 = scanner.nextInt();
            int mark3 = scanner.nextInt();
            int mark4 = scanner.nextInt();
            int mark5 = scanner.nextInt();
        double avg = Manager.countMark(mark1, mark2,mark3,mark4,mark5);

        String result = String.format("\nStudent's average mark = %.2f", avg);
        Printer.print(result);
    }
}
