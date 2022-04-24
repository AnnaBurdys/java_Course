package by.kursy.annaburdys.javatasks.Homework.Stage13.LevelB.Task05;

import by.kursy.annaburdys.javatasks.Classwork.Stage12.util.ArrayInitializer;
import by.kursy.annaburdys.javatasks.Homework.Stage13.LevelB.Model;
import by.kursy.annaburdys.javatasks.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Printer.print("Enter size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        ArrayInitializer.rndInit(array,-5,5);
        Printer.print(Arrays.toString(array));

        Printer.print("\nEnter number: ");
        int number = scanner.nextInt();

        int counter = Model.countAliquotNumberElements(array, number);

        String msg = String.format("\nAmount of aliquot number elements: %d", counter);
        System.out.println(msg);
    }
}
