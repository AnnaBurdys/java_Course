package by.kursy.annaburdys.javatasks.Classwork.Stage13.Task03;

import by.kursy.annaburdys.javatasks.Classwork.Stage13.ArraySorter;
import by.kursy.annaburdys.javatasks.view.Printer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,8,6,9,5,3,10,7};
        Printer.print("Before sorting: ");
        Printer.print(Arrays.toString(array));

        ArraySorter.selectedSortAsc(array);

        Printer.print("\nAfter sorting ");
        Printer.print(Arrays.toString(array));
    }
}