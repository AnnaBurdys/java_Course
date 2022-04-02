package by.kursy.annaburdys.javatasks.Classwork.Stage07;

import java.util.Scanner;

// сумму всех чётных цифр числа
public class Task02 {
    public static void main(String[] args) {
        System.out.print("Input number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = sumAllEvenDigits(number);
        String msg = String.format("Sum of even number digits = %d", sum);
        System.out.println(msg);
    }


    public static int sumAllEvenDigits (int number) {
        int sum = 0;
        while (number != 0) {
            int t = number % 10;
            if (t % 2 == 0) {
                sum += t;
            }
            number /= 10;
        }
        return sum;
    }

    public static int sumAllOddDigits (int number) {
        int sum = 0;
        while (number != 0) {
            int t = number % 10;
            if (t % 2 != 0) {
                sum += t;
            }
            number /= 10;
        }
        return sum;
    }

    public static int sumAllDigits (int number) {
        int sum = 0;
        while (number != 0) {
            int t = number % 10;
                sum += t;
            number /= 10;
        }
        return sum;
    }

}