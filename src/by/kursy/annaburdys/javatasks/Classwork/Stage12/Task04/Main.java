package by.kursy.annaburdys.javatasks.Classwork.Stage12.Task04;

import by.kursy.annaburdys.javatasks.Classwork.Stage12.Task01.LinearSearch;
import by.kursy.annaburdys.javatasks.Classwork.Stage12.util.ArrayInitializer;
import by.kursy.annaburdys.javatasks.Classwork.Stage12.util.Converter;
import by.kursy.annaburdys.javatasks.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        ArrayInitializer.rndInit(array, -10, 10);
      //  Arrays.sort(array);
        Printer.print("Input value for searching: ");
        int value = scanner.nextInt();
        System.out.println("Second index " + LinearSearch.findSecondIndex(array, value));
       // boolean result = BinarySearch.checkValue(array, value);

      //  int index = LinearSearch.findLastIndex(array, value);
      //  System.out.println("Index - " + index);

        Printer.print("\nArray: " + Converter.convertFromArrayToString(array));
       // String msg = result ? "Yes" : "No";
       // Printer.print("\nResult: " + msg);
    }
}