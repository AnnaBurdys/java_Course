package by.kursy.annaburdys.javatasks.Homework_Extra.Stage09;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        System.out.print("Input number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        number = number < 0 ? -number : number;
        boolean result = isEven(number);
        String msg = String.format("All digits even: %s ", result);
        System.out.println(msg);
    }

    public static boolean isEven(int number) {
        boolean flag = true;

        while (number != 0) {
            int t = number % 10;
            if (t % 2 != 0) {
                flag = false;
                break;
            }
            number /= 10;
        }
        return flag;
    }
}
