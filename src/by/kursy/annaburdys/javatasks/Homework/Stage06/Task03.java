package by.kursy.annaburdys.javatasks.Homework.Stage06;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number a: ");
        int a = scanner.nextInt();
        System.out.println("Input number b: ");
        int b = scanner.nextInt();
        int sum = a + b;
        int substraction = a - b;
        int multiple = a * b;
        double division;
        if (b == 0) {
            System.out.println("You can't divide by 0");
            return;
        } else {
            division = a / b;
        }
        int remains = a % b;
        System.out.println("Sum " + sum + "  Substraction " + substraction +
                "  Multiple " + multiple + "  Division " + division +"  Remains " + remains);
    }
}