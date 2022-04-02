package by.kursy.annaburdys.javatasks.Homework.Stage09;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        System.out.print("Input number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        number = number < 0 ? -number : number;
        boolean result = isAscending(number);
        String msg = String.format("Digits are ascending: %s", result);
        System.out.println(msg);
    }

    public static boolean isAscending(int number) {
        boolean flag = true;
        number = number < 0 ? -number : number;
        while (number > 10) {
            int digit = number % 10;
            number = number / 10;
            int num = number;

            while (num > 0) {
                int t = num % 10;
                num = num / 10;

                if (digit <= t) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
