package by.kursy.annaburdys.javatasks.Homework.Stage04;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input rectangle sides a and b: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double s = a * b;
        double p = (a + b) * 2;

        String msg = String.format("S = %.2f;\nP = %.2f;", s, p);

        System.out.println(msg);

        scanner.close();
    }

}
