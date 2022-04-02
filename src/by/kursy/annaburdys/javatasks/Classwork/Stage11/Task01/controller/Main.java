package by.kursy.annaburdys.javatasks.Classwork.Stage11.Task01.controller;

import by.kursy.annaburdys.javatasks.Classwork.Stage11.Task01.modelLogic.NumberLogic;
import by.kursy.annaburdys.javatasks.view.Printer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input number");
        int number = scanner.nextInt();
        int sum = NumberLogic.sumAllDigits(number);

        String result = String.format("Sum = %d", sum);
        Printer.print(result);
    }
}
