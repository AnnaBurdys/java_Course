package by.kursy.annaburdys.javatasks.Homework_Extra.Stage07;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input hour : ");
        int hour = scanner.nextInt();
        System.out.println("Input minute: ");
        int minute = scanner.nextInt();
        System.out.println("Input second: ");
        int second = scanner.nextInt();

        if (hour < 0 || minute < 0 || second < 0 || hour > 12 || minute > 59 || second > 59 ) {
            System.out.println("You entered wrong time");
            return;
        }

        String msg = String.format("Time %d.%d.%d is %d seconds from 00.00.00", hour, minute, second, countTime(hour, minute, second));
        System.out.println(msg);
    }

    public static int countTime(int hour, int minute, int second) {
        int time = hour * 3600 + minute * 60 + second;
        return time;
    }
}