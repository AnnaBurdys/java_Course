package by.kursy.annaburdys.javatasks.Homework_Extra.Stage04;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input time T1 and T2, boat speed V1 and flow speed U: ");
        double t1 = scanner.nextDouble();
        double t2 = scanner.nextDouble();
        double v1 = scanner.nextDouble();
        double u = scanner.nextDouble();

        double distance = (v1 + u) * t1 + (v1 - u) * t2;

        String msg = String.format("Distance = %.3f;", distance);

        System.out.println(msg);

        scanner.close();
    }
}
