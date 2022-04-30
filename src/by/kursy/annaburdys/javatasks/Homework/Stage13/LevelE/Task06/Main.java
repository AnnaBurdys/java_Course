package by.kursy.annaburdys.javatasks.Homework.Stage13.LevelE.Task06;

import by.kursy.annaburdys.javatasks.Classwork.Stage12.util.ArrayInitializer;
import by.kursy.annaburdys.javatasks.Homework.Stage13.LevelE.Model;
import by.kursy.annaburdys.javatasks.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Printer.print("Enter size: ");
        int size = scanner.nextInt();
        float[] array = new float[size];

        ArrayInitializer.rndInit(array, -5, 5);
        Printer.print(Arrays.toString(array));

        float result = Model.sumElementsAfterFirstPositive(array);
        String msg = String.format("\nSum after first positive: %f", result);
        System.out.println(msg);
    }
}