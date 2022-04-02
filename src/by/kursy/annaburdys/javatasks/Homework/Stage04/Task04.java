package by.kursy.annaburdys.javatasks.Homework.Stage04;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input point1 coordinates  x1, y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Input point2 coordinates x2, y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        String msg = String.format("Distance = %.2f;", distance);

        System.out.println(msg);

        scanner.close();
    }

}