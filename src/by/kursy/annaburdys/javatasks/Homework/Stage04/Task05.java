package by.kursy.annaburdys.javatasks.Homework.Stage04;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input coefficients A and B: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double x = -b / a;

        String msg = String.format("Equation: %.2fx + %.2f = 0\nx = %.2f;", a, b, x);

        System.out.println(msg);

        scanner.close();
    }

}
