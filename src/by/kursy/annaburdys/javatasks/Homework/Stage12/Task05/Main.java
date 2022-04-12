package by.kursy.annaburdys.javatasks.Homework.Stage12.Task05;

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

        ArrayInitializer.rndInit(array,0,5);
        System.out.println("Marks: " + Arrays.toString(array));
        int count0 = Model.countAmountOfMarks(array, 0);
        int count1 = Model.countAmountOfMarks(array, 1);
        int count2 = Model.countAmountOfMarks(array, 2);
        int count3 = Model.countAmountOfMarks(array, 3);
        int count4 = Model.countAmountOfMarks(array, 4);
        int count5 = Model.countAmountOfMarks(array, 5);

        float percent0 = Model.countPercent(array, count0);
        float percent1 = Model.countPercent(array, count1);
        float percent2 = Model.countPercent(array, count2);
        float percent3 = Model.countPercent(array, count3);
        float percent4 = Model.countPercent(array, count4);
        float percent5 = Model.countPercent(array, count5);
        String resultString = String.format("""
                Amount of fives: %d (%.1f %%)\s
                Amount of fours: %d (%.1f %%)
                Amount of triplets: %d (%.1f %%)
                Amount of deuces: %d (%.1f %%)
                Amount of units: %d (%.1f %%)
                Amount of zeros: %d (%.1f %%)""", count5, percent5, count4, percent4, count3, percent3,
                count2, percent2, count1, percent1, count0, percent0);
        System.out.println(resultString);
    }
}
