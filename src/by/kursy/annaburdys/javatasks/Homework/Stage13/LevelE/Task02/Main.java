package by.kursy.annaburdys.javatasks.Homework.Stage13.LevelE.Task02;

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
        int[] array = new int[size];

        ArrayInitializer.rndInit(array, -5, 5);
        Printer.print(Arrays.toString(array));

        int result = Model.sumElementsBtwZeros(array);
        String msg = String.format("\nSum between first and last zero elements: %d", result);
        System.out.println(msg);
    }
}