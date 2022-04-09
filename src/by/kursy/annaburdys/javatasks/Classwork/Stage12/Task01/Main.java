package by.kursy.annaburdys.javatasks.Classwork.Stage12.Task01;

import by.kursy.annaburdys.javatasks.Classwork.Stage12.Task01.util.ArrayInitializer;
import by.kursy.annaburdys.javatasks.Classwork.Stage12.Task01.util.Converter;
import by.kursy.annaburdys.javatasks.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input size of array: ");
        int size = scanner.nextInt();;

        int[] array = new int[size];

        ArrayInitializer.rndInit(array, -10, 10);

        Printer.print("Input value for searching: ");
        int value = scanner.nextInt();

        boolean result = LinearSearch.checkValue(array, value);

        int index = LinearSearch.findLastIndex(array, value);
        System.out.println("Index - " + index);

        Printer.print("\nArray: " + Converter.convertFromArrayToString(array));
        String msg = result ? "Yes" : "No";
        Printer.print("\nResult: " + msg);
    }
}
