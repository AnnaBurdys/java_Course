package by.kursy.annaburdys.javatasks.Classwork.Stage08;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Input your natural number: ");
            number = scanner.nextInt();
        } while (number <= 0);
        System.out.println("Your number is: " + number);
    }
}