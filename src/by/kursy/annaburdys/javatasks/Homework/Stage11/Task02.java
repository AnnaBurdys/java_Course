package by.kursy.annaburdys.javatasks.Homework.Stage11;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Input number: ");
        number = scanner.nextInt();

        int reverse = reverseNumber(number);
        String msg = String.format("Number is % d\nReversed number is %d", number, reverse);
        System.out.println(msg);
    }

    public static int reverseNumber (int number) {
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }
}