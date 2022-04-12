package by.kursy.annaburdys.javatasks.Classwork.Stage12.Task03;

import by.kursy.annaburdys.javatasks.Classwork.Stage12.Task01.LinearSearch;
import by.kursy.annaburdys.javatasks.Classwork.Stage12.util.ArrayInitializer;
import by.kursy.annaburdys.javatasks.Classwork.Stage12.util.Converter;
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

        int count = LinearSearch.findLastIndex(array, value);

        Printer.print("\nArray: " + Converter.convertFromArrayToString(array));
        String msg = String.format("Counter of value %d = %d", value, count);
        Printer.print("\nResult: " + msg);
    }
}
