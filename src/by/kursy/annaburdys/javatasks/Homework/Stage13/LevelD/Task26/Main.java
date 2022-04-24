package by.kursy.annaburdys.javatasks.Homework.Stage13.LevelD.Task26;

import by.kursy.annaburdys.javatasks.Classwork.Stage12.util.ArrayInitializer;
import by.kursy.annaburdys.javatasks.Homework.Stage13.LevelD.Model;
import by.kursy.annaburdys.javatasks.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Printer.print("Enter size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        ArrayInitializer.rndInit(array, -5, 5);
        Printer.print(Arrays.toString(array));

        boolean result = Model.isOneOdd(array);
        String msg = String.format("\nThere is only one odd element: %s", result);
        System.out.println(msg);
    }
}