package by.kursy.annaburdys.javatasks.Homework.Stage12.Task03;

import by.kursy.annaburdys.javatasks.Classwork.Stage12.util.ArrayInitializer;
import by.kursy.annaburdys.javatasks.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        ArrayInitializer.consoleInit(array);

        System.out.println(Arrays.toString(array));

        boolean result = Model.isDifferent(array);

        String resultString = (result) ? "Elements are different" : "Elements are the same";
        System.out.println(resultString);
    }
}
