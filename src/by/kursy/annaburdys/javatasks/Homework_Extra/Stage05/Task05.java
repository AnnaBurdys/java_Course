package by.kursy.annaburdys.javatasks.Homework_Extra.Stage05;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers a b c : ");

        String s = "Numbers are different";

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > 0 || b > 0 || c > 0) {
            s = "There is at least one positive number";
        }
        if (a < 0 || b < 0 || c < 0) {
            s = "There is at least one negative number";
        }
        System.out.println(s);
    }
}
