package by.kursy.annaburdys.javatasks.Classwork.Stage11.Task02.controller;

import by.kursy.annaburdys.javatasks.Classwork.Stage11.Task02.model.Manager;
import by.kursy.annaburdys.javatasks.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        Printer.print("Input count of students\n ");
        int count = scanner.nextInt();

        int[] marks = new int[count];   //definition

        Printer.print("Input marks: ");
        for (int i = 0; i< marks.length; i++) {
            marks[i] = scanner.nextInt();
        }
        double avg = Manager.countMark(marks);

        String result = String.format("\nStudent's average mark = %.2f", avg);
        Printer.print(result);
    }
}
