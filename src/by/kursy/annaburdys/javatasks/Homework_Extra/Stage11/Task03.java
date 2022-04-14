package by.kursy.annaburdys.javatasks.Homework_Extra.Stage11;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digitNumber;

        System.out.print("Input digit number: ");
        digitNumber = scanner.nextInt();
        if (digitNumber % 2 != 0) {
            System.out.println("Input error");
            return;
        }

        int counter = 0;
        int max = findMax(digitNumber);
        for (int i = 0; i <= max; i++) {
            if (isLucky(i,digitNumber)) {
                counter++;
            }
        }
        String msg = String.format("Amount of lucky tickets is %d", counter);
        System.out.println(msg);
    }

    public static int findMax (int digitNumber) {
        StringBuilder max = new StringBuilder("");
        for (int i = 0; i < digitNumber; i+=2) {
            max.append("99");
        }
        return Integer.parseInt(String.valueOf(max));
    }

    public static boolean isLucky(int number, int digitNumber) {
        boolean flag = false;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < digitNumber/2; i++) {
            int digit = number % 10;
            sum1 += digit;
            number /= 10;
        }

        while (number != 0) {
            int digit = number % 10;
            sum2 += digit;
            number /= 10;
        }
        if (sum1 == sum2) {
            flag = true;
        }
        return flag;
    }
}
