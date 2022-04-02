package by.kursy.annaburdys.javatasks.Homework.Stage07;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number : ");
        int number = scanner.nextInt();
        String msg = String.format("Number %d is palyndrome: %s", number, isPalyndrome(number));
        System.out.println(msg);
    }

    public static boolean isPalyndrome(int number) {
        if (number<0) {
            number = -number;
        }
        boolean flag = false;
        int digit1 = number % 10;
        number /= 10;
        int digit2 = number % 10;
        number /= 10;
        int digit3 = number % 10;
        number /= 10;
        int digit4 = number % 10;
        if (digit1 == digit4 && digit2 == digit3) {
            flag = true;
        }
        return flag;
    }
}