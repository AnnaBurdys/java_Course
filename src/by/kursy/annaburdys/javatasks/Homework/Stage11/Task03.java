package by.kursy.annaburdys.javatasks.Homework.Stage11;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number<= 0) {
            System.out.println("Input error");
            return;
        }

        System.out.println("Number is prime: " + isPrime(number));
    }

    public static boolean isPrime (int number) {
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
