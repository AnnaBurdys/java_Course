package by.kursy.annaburdys.javatasks.Classwork.Stage11.Task03.controller;

import by.kursy.annaburdys.javatasks.Classwork.Stage11.Task03.model.Logic;
import by.kursy.annaburdys.javatasks.view.Printer;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Printer.print("Input min number: ");
        int minNum = scanner.nextInt();
        Printer.print("Input max number: ");
        int maxNum = scanner.nextInt();
        Printer.print("Input array size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(maxNum - minNum + 1) + minNum;
        }

        Printer.print("Array is: ");
        for (int i = 0; i < numbers.length; i++) {
            Printer.print(numbers[i] + " ");
        }

        int sum = Logic.countEvenSum(numbers);

        String result = String.format("\nSum of all even elements = %d", sum);
        Printer.print(result);
    }
}