package by.kursy.annaburdys.javatasks.Homework_Extra.Stage09;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        System.out.print("Input number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        number = number < 0 ? -number : number;
        int digit = findDigit(number);
        System.out.println("Number of 0 :" + digit);
    }

    public static int findDigit(int number) {
        int counter = 0;
        while (number != 0) {
            int t = number % 10;
            if (t == 0) {
                counter++;
            }
            number /= 10;
        }
        return counter;
    }
}
