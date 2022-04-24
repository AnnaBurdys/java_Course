package by.kursy.annaburdys.javatasks.Homework.Stage13.LevelA.Task03;

import by.kursy.annaburdys.javatasks.Classwork.Stage12.util.ArrayInitializer;
import by.kursy.annaburdys.javatasks.Homework.Stage13.LevelA.Model;
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
        int counter = Model.countPositiveElements(array);
        Printer.print(Arrays.toString(array));
        String msg = String.format("\nAmount of positive elements: %d", counter);
        System.out.println(msg);
    }
}
