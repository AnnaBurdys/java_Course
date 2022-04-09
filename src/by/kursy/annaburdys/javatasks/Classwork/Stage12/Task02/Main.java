package by.kursy.annaburdys.javatasks.Classwork.Stage12.Task02;

import by.kursy.annaburdys.javatasks.Classwork.Stage12.Task01.LinearSearch;
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

        int firstIndex = LinearSearch.findFirstIndex(array, value);
        int lastIndex = LinearSearch.findLastIndex(array, value);

        Printer.print("\nArray: " + Converter.convertFromArrayToString(array));
        String msg = String.format("First index of value %d = %d, last index = %d", value, firstIndex, lastIndex);
        Printer.print("\n" + msg);
    }
}
