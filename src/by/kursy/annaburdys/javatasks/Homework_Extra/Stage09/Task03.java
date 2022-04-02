package by.kursy.annaburdys.javatasks.Homework_Extra.Stage09;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        System.out.print("Input number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        number = number < 0 ? -number : number;
        int result = isEven(number);
        String msg = String.format("Amount of even digits: %s ", result);
        System.out.println(msg);
    }

    public static int isEven(int number) {
        int counter = 0;
        while (number != 0) {
            int t = number % 10;
            if (t % 2 == 0) {
                counter++;
            }
            number /= 10;
        }
        return counter;
    }
}
