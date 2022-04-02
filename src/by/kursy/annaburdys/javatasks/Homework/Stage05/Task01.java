package by.kursy.annaburdys.javatasks.Homework.Stage05;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers a b c : ");
        String s = String.format("The majority of numbers are 0");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > 0 && b > 0 || b > 0 && c > 0 || a > 0 && c > 0) {
            s = String.format("The majority is positive");
        } else if (a < 0 && b < 0 || b < 0 && c < 0 || a < 0 && c < 0) {
            s = String.format("The majority is negative");
        }

        System.out.println(s);
    }
}
