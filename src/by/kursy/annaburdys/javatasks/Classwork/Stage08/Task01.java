package by.kursy.annaburdys.javatasks.Classwork.Stage08;

import java.util.Scanner;

// максимальная цифра числа
public class Task01 {

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

    public static int findMinDigit(int number) {
        int minDigit = number == 0 ? -number : number;
        while (number != 0) {
            int t = number % 10;
            if (t==0) {
                minDigit = 9;
                break;
            }
            if (t < minDigit) {
                minDigit = t;
            }
            number /= 10;
        }
        return minDigit;
    }

}