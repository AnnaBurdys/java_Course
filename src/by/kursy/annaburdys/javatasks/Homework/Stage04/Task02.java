package by.kursy.annaburdys.javatasks.Homework.Stage04;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input triangle sides a and b: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double c = Math.sqrt(a * a + b * b);
        double s = (a * b) / 2;
        double p = a + b + c;

        String msg = String.format("С = %.2f;\nS = %.2f;\nP = %.2f;", c, s, p);

        System.out.println(msg);

        scanner.close();
    }

}
