package by.kursy.annaburdys.javatasks.Homework_Extra.Stage05;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers a b c : ");
        String s;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b || a == -b || b == c || b == -c || a == c || a == -c) {
            s = "There are some equal numbers";
        } else {
            s = "All numbers are different";
        }
        System.out.println(s);
    }
}
