package by.kursy.annaburdys.javatasks.Homework.Stage11;
import java.util.Scanner;

import static by.kursy.annaburdys.javatasks.Homework.Stage11.Task03.isPrime;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        System.out.println("All prime dividers: " + countPrimeDividers(number));
    }

    public static StringBuilder countPrimeDividers (int number) {
        StringBuilder result = new StringBuilder();
        for (int i = 2; i<= number/2; i++) {
            if (isPrime(i)) {
                result.append(i).append("; ");
            }
        }
        return result;
    }
}