package by.kursy.annaburdys.javatasks.Homework.Stage07;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers a b c : ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a==0||b==0||c==0) {
            System.out.println("You entered 0");
            return;
        }

        String msg = String.format("One of numbers %d, %d, %d is even: %s", a, b, c, isEven(a, b, c));
        System.out.println(msg);
    }

    public static boolean isEven(int a, int b, int c) {
        boolean flag = false;
        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
            flag = true;
        }
        return flag;
    }
}
