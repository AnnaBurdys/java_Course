package by.kursy.annaburdys.javatasks.Classwork.Stage07;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        System.out.print("Input number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean result = isAllDigitsEven(number);
        String msg = result ? "Yes all number digits are even"
                : "No some number digits are not even";
        System.out.println(msg);
    }

    public static boolean isAllDigitsEven(int number) {
        boolean isAllEven = true;
        
        while (number != 0) {
            int t = number % 10;
            if (t % 2 != 0) {
                isAllEven = false;
                break;
            }
            number /= 10;
        }
        return isAllEven;
    }
}