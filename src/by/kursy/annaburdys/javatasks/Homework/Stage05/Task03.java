package by.kursy.annaburdys.javatasks.Homework.Stage05;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number : ");
        int n = scanner.nextInt();
        String s ="Not increase and not decrease";
        int num1 = n % 10;
        n /= 10;
        int num2 = n % 10;
        n /= 10;
        int num3 = n % 10;
        n /= 10;
        int num4 = n % 10;
        if (num1>num2 && num2>num3 && num3>num4) {
            s = "All numbers increase";
        } else if (num1<num2 && num2<num3 && num3<num4) {
            s = "All numbers decrease";
        }
        System.out.println(s);

    }
}
