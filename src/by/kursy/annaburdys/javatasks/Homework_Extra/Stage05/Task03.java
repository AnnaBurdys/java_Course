package by.kursy.annaburdys.javatasks.Homework_Extra.Stage05;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers a b c : ");
        String s;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == 0 || b == 0 || c == 0) {
            System.out.println("There are some numbers");
            return;
        }

        if (a > 0 && b > 0 && c > 0) {
            s = "All numbers are positive";
        } else if (a < 0) {
            s = "All numbers are negative";
        } else {
            s = "All numbers are different";
        }
        System.out.println(s);
    }
}