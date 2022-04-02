package by.kursy.annaburdys.javatasks.Classwork.Stage07;
// есть число есть ли одинаковые цифры

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number : ");

        int number = scanner.nextInt();

        boolean flag = false;

        while (number > 10) {
            int digit = number % 10;
            number = number / 10;
            int num = number;

            while (num > 0) {
                int t = num % 10;
                num = num / 10;

                if (digit == t) {
                    flag = true;
                }
            }
        }
        System.out.println("There are equal digits in number: " + flag);
    }
}
