package by.kursy.annaburdys.javatasks.Homework.Stage05;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number : ");
        int n = scanner.nextInt();

        int num1 = n % 10;
        n /= 10;
        int num2 = n % 10;
        n /= 10;
        int num3 = n % 10;
        n /= 10;
        int num4 = n % 10;

        int numReversed = 1000 * num1 + 100 * num2 + 10 * num3 + num4;
        System.out.println(numReversed);

    }
}