package by.kursy.annaburdys.javatasks.Homework_Extra.Stage04;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a year: ");
        int year = scanner.nextInt();

        int century = year / 100 + 1;
        boolean result = year % 100 != 0;

        String msg = result ? String.format("Year - %d;\nCentury - %d;", year, century)
                : String.format("Year - %d;\nCentury - %d;", year, century - 1);

        System.out.println(msg);

        scanner.close();
    }
}