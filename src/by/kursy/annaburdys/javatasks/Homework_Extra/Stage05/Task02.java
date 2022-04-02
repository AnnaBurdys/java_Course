package by.kursy.annaburdys.javatasks.Homework_Extra.Stage05;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers a b c : ");

        String s = "Numbers are different";

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == -b || b == -c || a == -c) {
            s = "There are some opposite numbers";
        } else if (a % 2 != 0 && b % 2 != 0 && c % 2 != 0) {
            s = "All numbers are different";
        }
        System.out.println(s);
    }
}
