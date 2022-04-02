package by.kursy.annaburdys.javatasks.Classwork.Stage08;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Input number: ");
            number = scanner.nextInt();
        } while (number < 0);
        long fact = factorial(number);
        String msg = String.format("%d! = %d", number, fact);
        System.out.println(msg);

    }

    public static long factorial(int number) {
        if (number < 0) {
            return -1;
        }

        long fact = 1;

        for (int i = 2; i <= number; i++) {
            fact *= i;
        }

        return fact;
    }
}