package by.kursy.annaburdys.javatasks.Homework_Extra.Stage09;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        System.out.print("Input number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        number = number < 0 ? -number : number;
        int maxDigit = findMaxDigit(number);
        System.out.println("Maximum is " + maxDigit);
    }

    public static int findMaxDigit(int number) {
        int maxDigit = 0;
        while (number != 0) {
            int t = number % 10;
            if (t==9) {
                maxDigit = 9;
                break;
            }
            if (t > maxDigit) {
                maxDigit = t;
            }
            number /= 10;
        }
        return maxDigit;
    }
}
