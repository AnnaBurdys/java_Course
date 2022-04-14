package by.kursy.annaburdys.javatasks.Homework_Extra.Stage11;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digitNumber;
        StringBuilder msg = new StringBuilder();

        System.out.print("Input count of digits: ");
        digitNumber = scanner.nextInt();
        switch (digitNumber) {
            case 2: {
                for (int number = 10; number <= 99; number++) {
                    if (isArmstrong(number, digitNumber)) {
                        msg.append(String.format("Number %d is Armstrong number\n",number));
                    }
                }
            }
            case 3: {
                for (int number = 100; number <= 999; number++) {
                    if (isArmstrong(number, digitNumber)) {
                        msg.append(String.format("Number %d is Armstrong number\n", number));
                    }
                }
            }
            case 4: {
                for (int number = 1000; number <= 9999; number++) {
                    if (isArmstrong(number, digitNumber)) {
                        msg.append(String.format("Number %d is Armstrong number\n", number));
                    }
                }
            }
            case 5: {
                for (int number = 10000; number <= 99999; number++) {
                    if (isArmstrong(number, digitNumber)) {
                        msg.append(String.format("Number %d is Armstrong number\n", number));
                    }
                }
            }
        }
        System.out.println(msg);
    }

    public static boolean isArmstrong(int number, int counter) {
        int sum = 0;
        int numberStart = number;
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, counter);
            number /= 10;
        }
        return sum == numberStart;
    }
}
