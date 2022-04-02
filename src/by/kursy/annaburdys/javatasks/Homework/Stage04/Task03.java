package by.kursy.annaburdys.javatasks.Homework.Stage04;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input numbers a, b and c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double arithmeticAv = (a + b + c) / 3;
        double geometricAv = Math.sqrt(a * b * c);

        String msg = String.format("Arithmetic average = %.2f;\nGeometric average = %.2f;", arithmeticAv, geometricAv);

        System.out.println(msg);

        scanner.close();
    }

}
