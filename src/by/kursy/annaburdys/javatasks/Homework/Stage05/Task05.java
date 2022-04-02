package by.kursy.annaburdys.javatasks.Homework.Stage05;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers x y : ");

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        String s ="";

        if (x == 0 && y == 0) {
            s = "(0,0)";
            System.out.println(s);
            return;
        }

        if (x > 0 && y > 0) {
            s = "1 quarter";
        } else if (x < 0 && y < 0) {
            s = "3 quarter";
        } else if (x > 0 && y < 0) {
            s = "4 quarter";
        } else if (x < 0 && y > 0) {
            s = "2 quarter";
        }
        System.out.println(s);
    }
}
