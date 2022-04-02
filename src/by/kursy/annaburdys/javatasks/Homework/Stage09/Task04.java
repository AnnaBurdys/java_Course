package by.kursy.annaburdys.javatasks.Homework.Stage09;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        System.out.print("Input number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        number = number < 0 ? -number : number;
        boolean result = isPalyndrom(number);
        String msg = String.format("Number is palyndrom: %s", result);
        System.out.println(msg);
    }

    public static boolean isPalyndrom(int number) {
        boolean flag = false;
        int temp = number;
        int rem, r = 0;
        for (; number!=0; number/=10) {
            rem = number % 10;
            r = r*10+rem;
        }
        if (temp == r) {
            flag = true;
        }
        return flag;
    }
}
